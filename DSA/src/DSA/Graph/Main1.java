package DSA.Graph;

import java.util.*;
public class Main1 {
    public static class Edge{
        int s,d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        graph[2].add(new Edge(2,3));
        graph[3].add( new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void Topology(ArrayList<Edge>[] graph){
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited,s);
            }
        }
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] visited,Stack<Integer>s){
              visited[curr]=true;
              for(Edge nei:graph[curr]){
                  if(!visited[nei.d]){
                      dfsUtil(graph,nei.d,visited,s);
                  }
              }
              s.push(curr);
    }
    public static void printallpaths(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+src);
            return;
        }
        for(Edge nei:graph[src]){
            printallpaths(graph,nei.d,dest,path+src);
        }
    }

    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();
        createGraph(graph);
        Topology(graph);
        int s=5,d=1;
        printallpaths(graph,s,d,"");
    }
}
