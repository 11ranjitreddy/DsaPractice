package DSA.Graph3;

import java.util.*;
public class Main {
    public  static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        ArrayList<Integer> graph[]=new ArrayList[v];

        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        for(int i=0;i<v;i++){
            int src=s.nextInt();
            int dest=s.nextInt();
            graph[src].add(dest);
        }

//        for(int i=0;i<v;i++){
//            for(int nei:graph[i]){
//                System.out.println(i+"-> "+nei);
//            }
//        }
        bfs(graph);
        dfs(graph);
        hashpath(graph,0,4,new boolean[v]);
    }
    public static void bfs(ArrayList<Integer>[] graph){
        boolean visited[]=new boolean[graph.length];
        ArrayList<Integer>list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            q.add(i);
            while (!q.isEmpty()){
                int curr=q.remove();
                visited[curr]=true;
                list.add(curr);
                for(int nei:graph[curr]){
                    if(!visited[nei]){
                    q.add(nei);}
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
                dfsUtil(i,graph,visited,list);
            }
        }
        return list;
    }
    public static void dfsUtil(int curr,ArrayList<Integer>[] graph,boolean visited[],ArrayList<Integer> list){
        visited[curr]=true;
        list.add(curr);
        for(int nei:graph[curr]){
            if(!visited[nei]){
                dfsUtil(nei,graph,visited,list);
            }
        }
    }
    public static boolean hashpath(ArrayList<Integer>graph [],int src,int dest,boolean visited[]){
        if(src==dest)return true;
        for(int nei:graph[src]){
            if(!visited[nei] && hashpath(graph,nei,dest,visited));
        }
        return false;
    }

}
