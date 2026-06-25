import java.util.*;

public class Cycle2 {
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

        graph.get(0).add(new Edge(0, 2));

        graph.get(1).add(new Edge(1, 0));

        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];
        boolean stack[] = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<ArrayList<Edge>> graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(stack[e.dest]) {
                return true;
            } 
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        System.out.println(isCycle(graph));
    }
}