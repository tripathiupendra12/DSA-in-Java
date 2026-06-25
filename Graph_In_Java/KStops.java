
import java.util.*;

public class KStops {
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

    public static void createGraph(int flights[][], ArrayList<ArrayList<Edge>> graph, int n) {
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph.get(src).add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;
        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(flights, graph, n);

        int dist[] = new int[n];
        for(int i = 0; i < n; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k) {
                break;
            }

            for(int i = 0; i < graph.get(curr.v).size(); i++) {
                Edge e = graph.get(curr.v).get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost+wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        //dist[dest]
        if(dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int flights[][] = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};
        int src = 0, dst = 3, k = 1;
        System.out.println(cheapestFlight(n, flights, src, dst, k));
    }
}