package DSA.Graph2;

import java.util.*;
public class GraphPractice {
    public  static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        ArrayList<Integer>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<v;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
        }
        for(int i=0;i<v;i++){
            for(int nei:graph[i]){
                System.out.println(i+" "+nei);
            }
        }
        bfs(graph);
       System.out.println(dfs(graph));
       System.out.println(haspath(graph,0,3,new boolean[v]));
       System.out.println(hasCycle(graph));
    }
    public static void bfs(ArrayList<Integer>[] graph){
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                q.add(i);
                while (!q.isEmpty()){
                    int curr=q.remove();
                    visited[curr]=true;
                    list.add(curr);
                    for(int nei:graph[curr]){
                        if(!visited[nei]){
                            q.add(nei);
                            visited[nei]=true;
                        }
                    }
                }
            }
        }
        System.out.print(list);
    }
    public static ArrayList<Integer> dfs(ArrayList<Integer>[] graph){
        ArrayList<Integer>list=new ArrayList<>();
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited,list);
            }
        }
        return  list;
    }
    public static void dfsUtil(ArrayList<Integer>[] graph,int curr,boolean  visited[],ArrayList<Integer>list){
        visited[curr]=true;
        list.add(curr);
        for(int nei:graph[curr]){
            if(!visited[nei]){
                dfsUtil(graph,nei,visited,list);
            }
        }
    }
    public static boolean haspath(ArrayList<Integer>[] graph,int src,int dest,boolean visited[]){
        if(src==dest)return true;
       for(int nei:graph[src]){
           if(!visited[nei] && haspath(graph,nei,dest,visited))return true;
       }
        return  false;
    }
    public static boolean hasCycle(ArrayList<Integer>[] graph){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(dfsCycle(graph,i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfsCycle(ArrayList<Integer>[] graph,int curr,boolean visited[],int parent){
        visited[curr]=true;

        for(int nei:graph[curr]){
            if(!visited[nei]){
                if(dfsCycle(graph,nei,visited,curr)){
                    return true;
                }
            }else if(nei!=parent){
                return true;
            }
        }
        return false;
    }

}
