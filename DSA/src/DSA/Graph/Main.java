package DSA.Graph;
import java.util.*;

public class Main {

    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }
    public  static void createGraph(ArrayList<Edge>[] graph){
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 2));
    }
    public static ArrayList<Integer> BFS(ArrayList<Edge>[] graph){
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
                        if(!visited[nei.dest]){
                            visited[nei.dest]=true;
                            q.add(nei.dest);
                        }
                    }
                }
            }
        }
        return list;
    }
    public static ArrayList<Integer> DFS(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited,list);
            }
        }
        return list;
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean visited[],ArrayList<Integer> list){
        visited[curr]=true;
        list.add(curr);
        for(Edge nei:graph[curr]){
            if(!visited[nei.dest]){
                dfsUtil(graph,nei.dest,visited,list);
            }
        }
    }
    public static boolean ByPartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++)
            col[i]=-1;

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                col[i]=0;
                q.add(i);
               while (!q.isEmpty()){
                   int curr=q.remove();
                   for(Edge nei:graph[curr]){
                       if(col[nei.dest]==-1){
                           int nextcolour=col[curr]==0?1:0;
                           col[nei.dest]=nextcolour;
                           q.add(nei.dest);
                       }else  if(col[nei.dest]==col[curr]){
                           return false;
                       }
                   }
               }
            }
        }
        return true;
    }
    public static boolean dfsTravese(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsCycle(graph,i,visited,-1);
                return  true;
            }
        }
        return false;
    }
    public static boolean HashPath(ArrayList<Edge>[] graph,int src,int dest,boolean visited[]){
        if(src==dest)return true;
        visited[src]=true;
        for(Edge nei:graph[src]){
            if(!visited[nei.dest] && HashPath(graph,nei.dest,dest,visited)){
                return true;
            }
        }
        return false;
    }
    public static boolean dfsCycle(ArrayList<Edge>[]graph,int curr,boolean visited[],int parent){
        visited[curr]=true;
        for(Edge nei:graph[curr]){
            if(!visited[nei.dest]){
                dfsCycle(graph,nei.dest,visited,curr);
                return true;
            }else  if(nei.dest!=parent)return true;
        }
        return false;
    }
    public static boolean DetectCycle(ArrayList<Edge>[] graph){
        int n=graph.length;
        int state[]=new int[n];
        for(int i=0;i<n;i++){
            if(state[i]==0){
                dfsDirect(graph,i,state);
            }
        }
        return false;
    }
    public static boolean dfsDirect(ArrayList<Edge>[] graph,int curr,int[] state){
        state[curr]=1;

        for(Edge nei:graph[curr]){
            if(state[nei.dest]==0){
                if(dfsDirect(graph,nei.dest,state)){
                    return true;
                }else if(state[nei.dest]==1){
                    return true;
                }
            }
        }
        state[curr]=2;
        return false;
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++)
            graph[i] = new ArrayList<>();

        createGraph(graph);
       System.out.println(BFS(graph));
       System.out.println(DFS(graph));
       System.out.println(ByPartite(graph));
       System.out.println(dfsTravese(graph));
       System.out.println(HashPath(graph,1,4,new boolean[v]));
       System.out.println(DetectCycle(graph));

    }
}