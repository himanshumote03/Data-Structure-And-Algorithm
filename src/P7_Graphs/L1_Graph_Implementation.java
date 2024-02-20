// Graph implementation using Adjacency List Matrix

package P7_Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class L1_Graph_Implementation {

    private LinkedList<Integer> adjacency[];

    public L1_Graph_Implementation(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);

//        System.out.print(adjacency[d]);
//        System.out.print(adjacency[s]);
    }

    public void bfs(int source) {
        boolean [] visitedNodes = new boolean[adjacency.length];
        int [] parentNode = new int[adjacency.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visitedNodes[source] = true;
        parentNode[source] = -1;

        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p+" ");
            for(int i: adjacency[p]) {
                if (visitedNodes[i] != true) {
                    visitedNodes[i] = true;
                    q.add(i);
                    parentNode[i] = p;
                }
            }
        }
    }

    public void dfs(int source) {
        boolean [] visitedNodes = new boolean[adjacency.length];
        int [] parentNode = new int[adjacency.length];
        Stack<Integer> q = new Stack<>();

        q.add(source);
        visitedNodes[source] = true;
        parentNode[source] = -1;

        while (!q.isEmpty()) {
            int p = q.pop();
            System.out.print(p+" ");
            for(int i: adjacency[p]) {
                if (visitedNodes[i] != true) {
                    visitedNodes[i] = true;
                    q.add(i);
                    parentNode[i] = p;
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        L1_Graph_Implementation g = new L1_Graph_Implementation(v);

        for (int i = 0; i < e; i++) {
            System.out.print("Enter source: ");
            int s = sc.nextInt();
            System.out.print("Enter destination: ");
            int d = sc.nextInt();
            g.insertEdge(s,d);
        }

        System.out.print("Enter source for bfs traversal: ");
        int source = sc.nextInt();
        System.out.println("BFS: ");
        g.bfs(source);
        System.out.println("DFS: ");
        g.dfs(source);
    }
}
/*
BFS OUTPUT:
Enter Number of Vertices: 5
Enter Number of Edges: 6
Enter source: 0
Enter destination: 1
Enter source: 0
Enter destination: 2
Enter source: 2
Enter destination: 3
Enter source: 3
Enter destination: 4
Enter source: 2
Enter destination: 4
Enter source: 1
Enter destination: 4
Enter source for bfs traversal: 2
BFS:
o/p: 2 0 3 4 1
DFS:
o/p: 2 3 1 4 0
 */