package DSA.Graph;

import  java.util.*;
public class BFS {

    public  static  class Edge{
        int source,dest;
        Edge(int s,int d){
            this.source=s;
            this.dest=d;
        }
    }
    public static  void main(String args[]){
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,2));

        bfs(graph);
    }
    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        for (int start = 0; start < graph.length; start++) {  // loop over all vertices
            if (!vis[start]) {                                  // start BFS from any unvisited one
                q.add(start);

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    if (!vis[curr]) {
                        System.out.print(curr + " ");
                        vis[curr] = true;

                        for (int i = 0; i < graph[curr].size(); i++) {
                            Edge e = graph[curr].get(i);
                            q.add(e.dest);
                        }
                    }
                }
            }
        }
    }
}
