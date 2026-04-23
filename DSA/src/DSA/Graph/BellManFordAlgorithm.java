package DSA.Graph;

import java.util.*;
public class BellManFordAlgorithm {

    public static int[] bellman(int V,int [][] edges){
        int dist[]=new int[V];
        for(int i=0;i<V;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[0]=0;
        for(int i=0;i<V-1;i++){
            for(int [] e:edges){
                int u=e[0],v=e[1],w=e[2];
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }

        }

        return dist;
    }
    public static void main(String args[]){
        int v=5;
        int [][]edges={{0,1,5},{1,2,1},{1,3,2},{2,4,1},{4,3,-1}};
        int []result=bellman(v,edges);
        System.out.print(Arrays.toString(result));

    }
}
