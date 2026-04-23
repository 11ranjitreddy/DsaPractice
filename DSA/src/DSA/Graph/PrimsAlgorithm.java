package DSA.Graph;

import  java.util.*;
public class PrimsAlgorithm {
    public static class Pair implements Comparable<Pair>{
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
    public static int prims(int V,int[][] edges){
        ArrayList<Pair>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i] = new ArrayList<>();
        for(int []e:edges){
            int u=e[0],v=e[1],w=e[2];
            graph[u].add(new Pair(v,w));
            graph[v].add(new Pair(u,w));
        }

        boolean visited[]=new boolean[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int cost=0;
        while (!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.node;
            if(visited[u])continue;
            visited[u]=true;
            cost+=curr.distance;
            for(Pair nei:graph[u]){
                int v=nei.node,wt=nei.distance;
                if(!visited[v]){
                    pq.add(new Pair(v,wt));
                }
            }
        }
        return cost;
    }

    public static void main(String args[]){
        int v=5;
        int [][] edges={{0,1,4},{0,2,8},{1,2,3},{1,4,6},{2,3,2},{3,4,10}};
         System.out.print(prims(v,edges));
    }
}
