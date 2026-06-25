
import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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

         //0-vertex
        graph.get(0).add(new Edge(0, 1, 10));
        graph.get(0).add(new Edge(0, 2, 15));
        graph.get(0).add(new Edge(0, 3, 30));

        //1-vertex
        graph.get(1).add(new Edge(1, 0, 10));
        graph.get(1).add(new Edge(1, 3, 40));

        //2-vertex
        graph.get(2).add(new Edge(2, 0, 15));
        graph.get(2).add(new Edge(2, 3, 50));

        //3-vertex
        graph.get(3).add(new Edge(3, 1, 40));
        graph.get(3).add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair>{
        int v; 
        int cost;
        int par;
        public Pair(int v, int c, int p) {
            this.v = v;
            this.cost = c;
            this.par = p;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0, -1));
        int finalCost = 0;
        ArrayList<Pair> ans = new ArrayList<>();

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;
                ans.add(new Pair(curr.par, curr.v, curr.cost));

                for(int i = 0; i < graph.get(curr.v).size(); i++) {
                    Edge e = graph.get(curr.v).get(i);
                    pq.add(new Pair(e.dest, e.wt, curr.v));
                }
            }
        }
        System.out.println(finalCost);
        for(Pair list : ans) {
            System.out.println(list.par+" "+ list.v + " " + list.cost);
        }
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        prims(graph);
    }
}