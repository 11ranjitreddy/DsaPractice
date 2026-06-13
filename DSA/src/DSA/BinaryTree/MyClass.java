package DSA.BinaryTree;
import  java.util.*;
public class MyClass {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public  static  class Bst{
        Node root;
        HashMap<Integer,Node> map=new HashMap<>();
        void insert(int child,int parent){
            if(!map.containsKey(child))
                map.put(child,new Node(child));

            Node childNode=map.get(child);
            if(parent==-1){
                root=childNode;
                return;
            }
            if(!map.containsKey(parent))
                map.put(parent,new Node(parent));
            Node parentNode=map.get(parent);
            if(parentNode.left==null)
                parentNode.left=childNode;
            else
                parentNode.right=childNode;

        }
        void print(Node root){
            if(root==null)return;
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
        int minlength(Node root){
            if(root==null)return 0;
            if(root.left==null && root.right==null)return 1;
            if(root.left==null)return 1+minlength(root.right);
            if(root.right==null)return 1+minlength(root.left);
            return 1+Math.min(minlength(root.left),minlength(root.right));
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Bst b=new Bst();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int child=s.nextInt();
            int parent=s.nextInt();
            b.insert(child,parent);
        }
        b.print(b.root);
        System.out.println();
        System.out.println(b.minlength(b.root));
    }
}
