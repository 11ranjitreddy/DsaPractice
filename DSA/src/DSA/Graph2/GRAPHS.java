package DSA.Graph2;

import java.util.ArrayList;

public class GRAPHS {
    public static void  main(String args[]){
        int v=7;
        ArrayList<Integer> [] graph=new ArrayList[v];

        for(int i=0;i<v;i++)
            graph[i]=new ArrayList<>();

        graph[0].add(1);
        graph[0].add(2);

        graph[1].add(3);
        graph[2].add(3);

        for(int i=0;i<v;i++)
        {
            for(int e:graph[i]){
                System.out.println(i+"-> "+e);
            }
        }
        bfs(graph);
        dfs(graph);
        haspath(graph);
        detectCycle(graph);
        bipartite(graph);
        topological(graph);
        allpaths(graph);
        dijkstras(graph);
        bellman(graph);
        prims(graph);
    }
}
