

import java.util.*;

public class Paths {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph, int V) {
        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 3));

        graph.get(2).add(new Edge(2,3));

        graph.get(3).add(new Edge(3,1));

        graph.get(4).add(new Edge(4,0));
        graph.get(4).add(new Edge(4,1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));

    }

   public static void printAllPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, String path) {
        if(src == dest) {
            System.out.println(path+dest);
            return;
        }

        for(int i = 0; i < graph.get(src).size(); i++) {
            Edge e = graph.get(src).get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }
   }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);

        int src = 5, dest = 1;
        printAllPath(graph, src, dest, "");

    }
}