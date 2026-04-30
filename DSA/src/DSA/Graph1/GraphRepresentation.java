package DSA.Graph1;
import java.util.*;

public class GraphRepresentation {


    public  static  void main(String args[]) {
        int v=7;
        ArrayList<Integer>[] list = new ArrayList[v];


        for (int i = 0; i < v; i++)
            list[i] = new ArrayList<>();


        list[0].add(1);
        list[0].add(2);

        list[1].add(0);
        list[1].add(2);

        list[2].add(0);
        list[2].add(1);
        list[2].add(3);
        list[2].add(4);

        list[3].add(2);
        list[3].add(4);

        list[4].add(2);

        for (int i = 0; i < v; i++) {
            for (int nei : list[i]){
                System.out.println(i+" "+nei);
            }
        }
        bfs(list);
        System.out.println(dfs(list));
    }
    public  static void bfs(ArrayList<Integer> list[]){
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[list.length];

        for(int i=0;i<list.length;i++){
            if(!visited[i]){
                q.add(i);

                while (!q.isEmpty()){
                    int curr=q.remove();
                    l.add(curr);
                    visited[curr]=true;

                    for(int nei:list[curr]){
                        if(!visited[nei]){
                            q.add(nei);
                            visited[nei]=true;
                        }
                    }
                }
            }
        }
        System.out.println(l);
    }
    public static ArrayList<Integer> dfs(ArrayList<Integer> list[]){

        ArrayList<Integer> l=new ArrayList<>();
        boolean visited[]=new boolean[list.length];

        for(int i=0;i<list.length;i++){
            if(!visited[i]){
                dfsUtil(list,i,visited,l);
            }
        }

        return l;
    }
    public  static void dfsUtil(ArrayList<Integer> list[],int curr,boolean visited[],ArrayList<Integer> l){
         visited[curr]=true;

         l.add(curr);

         for(int a:list[curr]){
             if(!visited[a]){
                 dfsUtil(list,a,visited,l);
             }
         }
    }

}
