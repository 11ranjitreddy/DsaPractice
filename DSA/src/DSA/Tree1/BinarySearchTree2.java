package DSA.Tree1;

import java.util.*;
public class BinarySearchTree2 {

    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static class BinarySearchTree {
        Node root;

        Node insert(Node root, int data) {
            if (root == null) return new Node(data);
            else if (data < root.data)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);
            return root;
        }

        void preorder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + "->");
            preorder(root.left);
            preorder(root.right);
        }

        public static boolean getpath(Node root, int n, ArrayList<Node> path) {
            if (root == null) return false;
          path.add(root);
          if(root.data==n){
              return true;
          }
          boolean foundleft=getpath(root.left,n,path);
          boolean foundright=getpath(root.right,n,path);
          if(foundleft||foundright)return true;
          path.remove(path.size()-1);
          return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getpath(root, n1, path1);
            getpath(root, n2, path2);
            int i=0;
            for(;i<path1.size()&&i<path2.size();i++){
                if(path1.get(i)!=path2.get(i))
                    break;
            }
            Node lca=path1.get(i-1);
            return lca;
        }
    }
    public static void main(String args[]){
        BinarySearchTree b=new BinarySearchTree();
        int a[]={5,4,3,2,1,6,7,8,9};
        for(int x:a)
            b.root=b.insert(b.root,x);
        b.preorder(b.root);
        System.out.println();
        System.out.print((b.root=b.lca(b.root,2,7)).data);
    }
}
