import java.util.*;

public class BFS {
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

    public static void bfs(ArrayList<ArrayList<Edge>> graph) {
        boolean vis[] = new boolean[graph.size()];
        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<ArrayList<Edge>> graph, boolean vis[]) { //O(V + E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source = 0

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) {
                System.out.println(curr +" ");
                vis[curr] = true;
                for(int i = 0; i < graph.get(curr).size(); i++) {
                    Edge e = graph.get(curr).get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        bfs(graph);
    }
}