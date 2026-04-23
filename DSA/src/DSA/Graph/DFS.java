package DSA.Graph;

import java.util.*;
public class DFS {
    public  static class  Edge{
        int s,d;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
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
    }
    public static ArrayList<Integer> bfs(ArrayList<Edge>[] graph){
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];

        for(int start=0;start<graph.length;start++){
            if(!visited[start]){
                visited[start]=true;
                q.add(start);

                while (!q.isEmpty()){
                    int curr=q.remove();
                    list.add(curr);
                    for(Edge nei:graph[curr]){
                        if(!visited[nei.d]){
                            visited[nei.d]=true;
                            q.add(nei.d);
                        }
                    }
                }
            }
        }
        return list;
    }
    public static ArrayList<Integer> dfs(ArrayList<Edge>[] graph){
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsutil(graph,i,visited,list);
            }
        }
          return list;
    }
    public static void dfsutil(ArrayList<Edge>[] graph,int curr,boolean[] visit,ArrayList<Integer> list){
        visit[curr]=true;
        list.add(curr);

        for(Edge nei:graph[curr]){
            if(!visit[nei.d]){
                dfsutil(graph,nei.d,visit,list);
            }
        }
    }
    public static boolean hashpath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for (Edge nei:graph[src]){
            if(!visited[nei.d] && hashpath(graph,nei.d,dest,visited)){
            return true;
            }
        }
        return false;
    }
    public static boolean dfstraverse(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfscycle(graph,i,visited,-1);
                return true;
            }
        }
        return false;
    }
    public static boolean dfscycle(ArrayList<Edge>[] graph,int curr,boolean visited[],int parent){
        visited[curr]=true;
        for (Edge nei:graph[curr]){
            if(!visited[nei.d]){
                if(dfscycle(graph,nei.d,visited,curr)){
                    return true;
                }
            }else{
                if(nei.d!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean bypartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<col.length;i++)
            col[i]=-1;

        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                col[i]=0;
                q.add(i);

                while (!q.isEmpty()){
                       int curr=q.remove();

                       for(Edge nei:graph[curr]){
                           if(col[nei.d]==-1){
                               int next=col[curr]==0?1:0;
                               col[nei.d]=next;
                               q.add(nei.d);
                           }else if(col[nei.d]==col[curr])
                               return false;
                       }
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
          int v=7;
          ArrayList<Edge>[] graph=new ArrayList[v];

          for(int i=0;i<graph.length;i++)
              graph[i]=new ArrayList<>();

          createGraph(graph);
          System.out.println(bfs(graph));
          System.out.println(dfs(graph));
          System.out.println(hashpath(graph,1,3,new boolean[v]));
          System.out.println(dfstraverse(graph));
          System.out.println(bypartite(graph));
    }
}
