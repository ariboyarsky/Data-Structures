// Kruskal's algorithm without a priority queue
//
// Author: Ari Boyarsky
// Date: Nov, 2015.

import edu.gwu.algtest.*;
import edu.gwu.util.*;
import edu.gwu.debug.*;

import java.util.*;
import java.io.*;

public class Kruskal implements SpanningTreeAlgorithm {

  // Debugging for internal use.
  private static final boolean debug = true;

  int algID;                         // Given by test-environment.
  PropertyExtractor props;           // Properties file.

  int numVertices;                   // Number of vertices (when initialized).

  boolean useMatrix;                 // Adjacency matrix or list?

  double[][] adjMatrix;              // The adjacency matrix (given as input).
  GraphVertex[] adjList;             // The adjacency list (given as input).

  int[] predecessor;                 // Store predecessors to build MST.
  double[] predecessorEdgeWeight;    // Store edge weights as well.

  double[][] treeMatrix;             // The MST, if required in matrix form.
  GraphVertex[] treeList;            // The MST, if required in list form.


  double treeWeight;                 // Total weight of tree.


  //---------------- Algorithm interface ------------------------------------

  public String getName ()
  {
    return "Ari Boyarsky's implementation of Kruskal";
  }


  public void setPropertyExtractor (int algID, PropertyExtractor props)
  {
    this.algID = algID;
    this.props = props;
  }


  //---------------- SpanningTreeAlgorithm interface -------------------------

  public void initialize (int numVertices)
  {
    this.numVertices = numVertices;
    predecessor = new int [numVertices];
    predecessorEdgeWeight = new double [numVertices];
  }


  int find(int i)
  {
    // find root and make root as parent of i (path compression)
      return predecessor[i];

    //return find(predecessor[i]);
  }

// A function that does union of two sets of x and y
// (uses union by rank)
public void union(int x, int y)
{
    int a = find(x);
    int b = find(y);

    if(a == b){
      return;
    }else{
      predecessor[a] = b;
      return;
    }
}

  public double[][] minimumSpanningTree (double[][] adjMatrix)
  {
    // Consistency check:
    if (numVertices != adjMatrix.length) {
      System.out.println ("ERROR: adjMatrix length not equal to numVertices");
      return null;
    }

    // We are using an adjacency list.
    useMatrix = true;
    int[] set = new int[numVertices];
    for(int i = 0; i < numVertices-1; i++){
      set[i] = find(i);
    }

    Arrays.sort(set);

    treeMatrix = new double[numVertices][numVertices];
    int k = numVertices;
    while(k != 0){
      k--;
      if(find(set[k]) != find(k)){
        union(set[k], k);
        treeMatrix[set[k]][k] = adjMatrix[set[k]][k];
        treeMatrix[k][set[k]] = adjMatrix[set[k]][k];
      }
    }

    return treeMatrix;


  }

  public GraphVertex[] minimumSpanningTree (GraphVertex[] adjList)
  {
    // ... (not shown) ...
    return null;
  }

  public double getTreeWeight ()
  {
    return treeWeight;
  }


}
