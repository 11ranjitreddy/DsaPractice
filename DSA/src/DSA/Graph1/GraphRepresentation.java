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
    }
}
