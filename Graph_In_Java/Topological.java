import java.util.*;

public class Topological {
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

        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));

        graph.get(4).add(new Edge(4, 0));
        graph.get(4).add(new Edge(4, 1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
    }

    public static void topSort(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, s);//modified dfs
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<ArrayList<Edge>> graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);

        topSort(graph);
    }
}