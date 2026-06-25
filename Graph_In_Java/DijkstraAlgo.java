

import java.util.*;

public class DijkstraAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph, int V) {
        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));

        graph.get(1).add(new Edge(1, 3, 7));
        graph.get(1).add(new Edge(1, 2, 1));

        graph.get(2).add(new Edge(2, 4, 3));

        graph.get(3).add(new Edge(3, 5, 2));

        graph.get(4).add(new Edge(4, 3, 2));
        graph.get(4).add(new Edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;
        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

   public static void dijkstra(ArrayList<ArrayList<Edge>> graph, int src) {
        int dist[] = new int[graph.size()];
        for(int i = 0; i < graph.size(); i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[graph.size()];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        //loop
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;
                //neighbours
                for(int i = 0; i < graph.get(curr.n).size(); i++) {
                    Edge e = graph.get(curr.n).get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt  < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for(int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]+" ");
        }
        System.out.println();
   }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);

        int src = 0;
        dijkstra(graph, src);
    }
}