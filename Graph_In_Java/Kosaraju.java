import java.util.*;

public class Kosaraju {
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

        graph.get(0).add(new Edge(0,2));
        graph.get(0).add(new Edge(0,3));

        graph.get(1).add(new Edge(1,0));

        graph.get(2).add(new Edge(2,1));

        graph.get(3).add(new Edge(3,4));
    }

    public static void topSort(ArrayList<ArrayList<Edge>> graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    } 

    public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr+" ");

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<ArrayList<Edge>> graph, int V) {
        //step 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        //step 2
        ArrayList<ArrayList<Edge>> transpose = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            vis[i] = false;
            transpose.add(new ArrayList<>());
        }

        for(int i = 0; i < graph.size(); i++) {
            for(int j = 0; j < graph.get(i).size(); j++) {
                Edge e = graph.get(i).get(j); //e.src -> e.dest
                transpose.get(e.dest).add(new Edge(e.dest, e.src)); //revese of graph
            }
        }

        //step 3
        while(!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]) {
                System.out.print("SCC->");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        kosaraju(graph, V);
    }
}