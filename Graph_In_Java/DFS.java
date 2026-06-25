import java.util.*;

public class DFS {
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
        graph.get(0).add(new Edge(0, 1, 1));

        //1-vertex
        graph.get(1).add(new Edge(1, 0, 1));
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(1).add(new Edge(1, 3, 1));

        //2-vertex
        graph.get(2).add(new Edge(2, 1, 1));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 1));

        //3-vertex
        graph.get(3).add(new Edge(3, 1, 1));
        graph.get(3).add(new Edge(3, 2, 1));

        //4-vertex
        graph.get(4).add(new Edge(4, 2, 1));
    }

    public static void dfs(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];
        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<ArrayList<Edge>> graph, int curr, boolean vis[]) { //O(V + E)
        //visit
        System.out.println(curr +" ");
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    //O(V + E)
    public static boolean hasPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean vis[]) {
        if(src == dest) {
            return true;
        }

        vis[src] = true;
        for(int i = 0; i < graph.get(src).size(); i++) {
            Edge e = graph.get(src).get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        // dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 7, new boolean[V]));
    }
}