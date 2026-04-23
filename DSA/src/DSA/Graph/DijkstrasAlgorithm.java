package DSA.Graph;
import DSA.Arrays.Pairs;

import  java.util.*;

public class DijkstrasAlgorithm {
    public static class Edge{
        int s,d,w;
        Edge(int s,int d,int w){
            this.s=s;
            this.d=d;
            this.w=w;
        }
    }

    public  static  void createGraph(ArrayList<Edge>[] graph){
        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,8));

        graph[1].add(new Edge(1,0,4));
        graph[1].add(new Edge(1,2,3));
        graph[1].add(new Edge(1,4,6));

        graph[2].add(new Edge(2,0,8));
        graph[2].add(new Edge(2,1,3));
        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,2,2));
        graph[3].add(new Edge(3,4,10));

        graph[4].add(new Edge(4,1,6));
        graph[4].add(new Edge(4,3,10));

    }
     static class Pair implements Comparable<Pair>{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
        public int compareTo(Pair p){
            return this.distance-p.distance;
        }
    }
    public static void dijkstras(ArrayList<Edge>[] graph,int src){
        int n=graph.length;
        int dist[]=new int[n];
        boolean visited[]=new boolean[n];
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[src]=0;
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;

                for(Edge nei:graph[curr.node]){
                    int u=nei.s;
                    int v=nei.d;
                    int wt=nei.w;

                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        System.out.println("Shortest distances from source:");
        for (int i = 0; i < n; i++) {
            System.out.println("0 -> " + i + " = " + dist[i]);
        }


    }

    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();
        createGraph(graph);

        dijkstras(graph,0);
    }
}
