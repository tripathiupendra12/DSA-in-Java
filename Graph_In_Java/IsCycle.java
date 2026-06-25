import java.util.*;

public class IsCycle {
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

        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(0).add(new Edge(0, 3));

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 2));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 1));

        graph.get(3).add(new Edge(3, 0));
        graph.get(3).add(new Edge(3, 4));

        graph.get(4).add(new Edge(4, 3));
    }

    public static boolean isCycle(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph, i, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<ArrayList<Edge>> graph, int start, boolean vis[]) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, -1});
        vis[start] = true;

        while(!q.isEmpty()) {
            int[] curr = q.remove();
            int u = curr[0];
            int parU = curr[1];
            for(Edge e : graph.get(u)) {
                if(!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(new int[]{e.dest, u});
                } else if(e.dest != parU) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        System.out.println(isCycle(graph));
    }
}