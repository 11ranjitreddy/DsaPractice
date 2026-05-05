//package DSA.Graph2;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//public class GRAPHS {
//    public static void  main(String args[]){
//        int v=7;
//        ArrayList<Integer> [] graph=new ArrayList[v];
//
//        for(int i=0;i<v;i++)
//            graph[i]=new ArrayList<>();
//
//        graph[0].add(1);
//        graph[0].add(2);
//
//        graph[1].add(3);
//        graph[2].add(3);
//
//        for(int i=0;i<v;i++)
//        {
//            for(int e:graph[i]){
//                System.out.println(i+"-> "+e);
//            }
//        }
//        bfs(graph);
//        dfs(graph);
//        haspath(graph);
//        detectCycle(graph);
//        bipartite(graph);
//        topological(graph);
//        allpaths(graph);
//        dijkstras(graph);
//        bellman(graph);
//        prims(graph);
//    }
//    public static void bfs(ArrayList<Integer>[] graph){
//    ArrayList<Integer> list=new ArrayList<>();
//    boolean visited[]=new boolean[graph.length];
//        Queue<Integer> q=new LinkedList<>();
//
//        for(int i=0;i<graph.length;i++){
//            if(!visited[i]){
//                q.add(i);
//                while (q.isEmpty()){
//                    int curr=q.remove();
//                    list.add(curr);
//                    visited[curr]=true;
//                    for(int nei:graph[curr]){
//                        if(!visited[nei]){
//                            q.add(nei);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(list);
//    }
//    public static ArrayList<Integer> dfs(ArrayList<Integer>[] graph){
//        boolean visited[]=new boolean[graph.length];
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<graph.length;i++){
//            if(!visited[i]){
//                dfsUtil(graph,i,visited,list);
//            }
//        }
//        return list;
//    }
//    public static void dfsUtil(ArrayList<Integer>[] graph,int curr,boolean visited[],ArrayList<Integer>list){
//           visited[curr]=true;
//           list.add(curr);
//           for(int nei:graph[curr]){
//               if(!visited[nei]){
//                   dfsUtil(graph,nei,visited,list);
//               }
//           }
//    }
//    public static boolean haspath(ArrayList<Integer>[] graph,int src,int dest,boolean visited[]){
//        if(src==dest)return  true;
//
//        for(int nei:graph[src]){
//            if(!visited[nei] && haspath(graph,nei,dest,visited)){
//                return  true;
//            }
//        }
//
//        return false;
//    }
//    public static boolean detectCycle(ArrayList<Integer>[] graph){
//        boolean visited[]=new boolean[graph.length];
//        for(int i=0;i<graph.length;i++){
//            if(!visited[i]){
//                if(dfsCycle(graph,i,visited,-1)){
//                    return  true;
//                }
//            }
//        }
//        return  false;
//    }
//    public  static  boolean dfsCycle(ArrayList<Integer>[] graph,int src,boolean visited[],int parent){
//        visited[src]=true;
//        for(int nei:graph[src]){
//            if(!visited[nei]){
//                dfsCycle(graph,nei,visited,src);
//                return true;
//            }else if(nei!=src){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public  static boolean bipartite(ArrayList<Integer>[] graph){
//
//        Queue<Integer> q=new LinkedList<>();
//       int col[]=new int[graph.length];
//       for(int i=0;i<graph.length;i++)
//           col[i]=-1;
//
//       for(int i=0;i<graph.length;i++){
//           if(col[i]==-1){
//               col[i]=0;
//               q.add(i);
//               while (!q.isEmpty()){
//                   int curr=q.remove();
//
//                   for(int nei:graph[curr]){
//                       if(col[nei]==-1){
//                           int nextcol=col[curr]==0?1:0;
//                           col[nei]=nextcol;
//                       }else if(col[nei]==col[curr]){
//                           return false;
//                       }
//                   }
//               }
//           }
//       }
//       return  true;
//    }
//
//    public  static void topological(ArrayList<Integer>[] graph){
//        Stack<Integer> s=new Stack<>();
//        boolean visited[]=new boolean[graph.length];
//        for(int i=0;i<graph.length;i++){
//
//        }
//    }
//    public static  void allpaths(ArrayList<Integer>[] graph){
//
//    }
//    public  static void dijkstras(ArrayList<Integer>[] graph){
//
//    }
//    public static  void bellman(ArrayList<Integer>[] graph){
//
//    }
//    public  static void prims(ArrayList<Integer>[] graph){
//
//    }
//}
