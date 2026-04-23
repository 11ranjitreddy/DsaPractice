package DSA.Graph;

import  java.util.*;
public class DijkstrasAlgorithm1 {

    public static class Pair implements Comparable<Pair>{
        int n;
        int d;
        Pair(int n,int d){
            this.n=n;
            this.d=d;
        }
        public int compareTo(Pair p){
            return this.d-p.d;
        }
    }
    public static void main(String args[]){
        int v=5;
        int [][] edges={{0,1,4},{0,2,8},{1,2,3},{1,4,6},{2,3,2},{3,4,10}};
       System.out.println( Arrays.toString(dijkstras(v,edges,0)));


    }
    public static int[] dijkstras(int v,int [][] edges,int src){
        ArrayList<Pair>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();
        for(int []e:edges){
            int u=e[0],w=e[1],x=e[2];
            graph[u].add(new Pair(w,x));
            graph[w].add(new Pair(u, x));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();


        int dist[]=new int[v];
        for(int i=0;i<v;i++)
            dist[i]=Integer.MAX_VALUE;
        dist[src] = 0;

        pq.add(new Pair(src,0));
        while (!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.n;
            for(Pair nei:graph[u]){
                int vv=nei.n;
                int wt=nei.d;
                if(dist[u]+wt<dist[vv]){
                    dist[vv]=dist[u]+wt;
                    pq.add(new Pair(vv,dist[vv]));
                }
            }
        }
        return dist;

    }

}
