package P8_Minimum_Spanning_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class L1_KruskalAlgorithm {

    // class Edge to create an edge of the graph that implements Comparable interface
    class Edge implements Comparable<Edge> {
        int source, destination, weight;

        public int compareTo(Edge edgeToCompare) {
            return this.weight - edgeToCompare.weight;
        }
    };

    // class Subset for union
    class Subset {
        int parent, value;
    };

    // initialize vertices, edges and edgeArray
    int vertices, edges;
    Edge [] edgeArray;

    // constructor to create graph


    public L1_KruskalAlgorithm(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        edgeArray = new Edge[this.edges];
        for (int i = 0; i < edges; ++i) {
                edgeArray[i] = new Edge();      // create edge for all the edges by the user
        }
    }

    void applyKruskal() {
        // initialize finalResult array to store the final MST
        Edge [] finalResult = new Edge[vertices];
        int newEdge = 0;
        int index = 0;
        for (index = 0; index < vertices; ++index) {
            finalResult[index] = new Edge();
        }

        Arrays.sort(edgeArray);     // to sorting edges

        // an array of the vertices of type subset of vertices
        Subset [] subsetArray = new Subset[vertices];

        // allocate memory to create vertices subset
        for (index = 0; index < vertices; ++index) {
            subsetArray[index] = new Subset();
        }

        // it is used to create subset with single element
        for (int vertex = 0; vertex < vertices; ++vertex) {
            subsetArray[vertex].parent = vertex;
            subsetArray[vertex].value = 0;
        }
        index = 0;

        // use for loop to pic the smaller edge from the edges and increment the index for next iteration
        while (newEdge < vertices-1) {
            // create an instance of Edge for next edge
            Edge nextEdge = new Edge();
            nextEdge = edgeArray[index++];

            int nextSource = findSetOfElement(subsetArray, nextEdge.source);
            int nextDestination = findSetOfElement(subsetArray, nextEdge.destination);

            // if the edge doesn't create cycle after including it, we add it in the result and increment the index
            if (nextSource != nextDestination) {
                finalResult[newEdge++] = nextEdge;
                performUnion(subsetArray, nextSource, nextDestination);
            }
        }
        for (index = 0; index < newEdge; ++index) {
            System.out.println(finalResult[index].source+" - "+finalResult[index].destination+" : "+finalResult[index].weight);
        }
    }

    int findSetOfElement(Subset subsetArray[], int i) {
        if (subsetArray[i].parent != i) {
            subsetArray[i].parent = findSetOfElement(subsetArray, subsetArray[i].parent);
        }
        return subsetArray[i].parent;
    }

    void performUnion(Subset subsetArray[], int sourceRoot, int destinationRoot) {
        int nextSourceRoot = findSetOfElement(subsetArray, sourceRoot);
        int nextDestinationRoot = findSetOfElement(subsetArray, destinationRoot);

        if (subsetArray[nextSourceRoot].value < subsetArray[nextDestinationRoot].value) {
            subsetArray[nextSourceRoot].parent = nextDestinationRoot;
        }
        else if (subsetArray[nextSourceRoot].value > subsetArray[nextDestinationRoot].value) {
            subsetArray[nextDestinationRoot].parent = nextSourceRoot;
        }
        else {
            subsetArray[nextDestinationRoot].parent = nextSourceRoot;
            subsetArray[nextDestinationRoot].value++;
        }
    }

    public static void main(String[] args) {
        int v, e;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        e = sc.nextInt();
        System.out.println();

        // create a graph
        L1_KruskalAlgorithm graph = new L1_KruskalAlgorithm(v,e);

        for (int i = 0; i < e; i++) {
            System.out.print("Enter source value for edge["+i+"]: ");
            graph.edgeArray[i].source = sc.nextInt();

            System.out.print("Enter destination value for edge["+i+"]: ");
            graph.edgeArray[i].destination = sc.nextInt();

            System.out.print("Enter weight for edge["+i+"]: ");
            graph.edgeArray[i].weight = sc.nextInt();
            System.out.println();
        }

        System.out.println("MST:");
        // call applyKruskal() method to get MST
        graph.applyKruskal();
    }
}

/*
OUTPUT:
Enter number of vertices: 5
Enter number of edges: 7

Enter source value for edge[0]: 0
Enter destination value for edge[0]: 1
Enter weight for edge[0]: 8

Enter source value for edge[1]: 0
Enter destination value for edge[1]: 2
Enter weight for edge[1]: 5

Enter source value for edge[2]: 1
Enter destination value for edge[2]: 2
Enter weight for edge[2]: 9

Enter source value for edge[3]: 1
Enter destination value for edge[3]: 3
Enter weight for edge[3]: 11

Enter source value for edge[4]: 2
Enter destination value for edge[4]: 3
Enter weight for edge[4]: 15

Enter source value for edge[5]: 2
Enter destination value for edge[5]: 4
Enter weight for edge[5]: 10

Enter source value for edge[6]: 4
Enter destination value for edge[6]: 3
Enter weight for edge[6]: 7

MST:
0-2: 5
4-3: 7
0-1: 8
2-4: 10
 */