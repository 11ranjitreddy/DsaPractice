package DSA.Tree;

import java.util.Scanner;

public class BINARYTREE {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }

    }

    static class Binary{
        Node root;
        Node Insert(Node root,int value){
            if(root==null)return new Node(value);
          else  if(value<root.data)
                root.left=Insert(root.left,value);
           else root.right=Insert(root.right,value);
                return root;
        }

        boolean Search(Node root,int key){
            if(root==null)return false;
            if(key==root.data)return true;

            return key>root.data? Search(root.right,key): Search(root.left,key);
        }

        void preorder(Node root){
            if(root==null)return;
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        void inorder(Node root){
            if(root==null)return;
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        void postorder(Node root){
            if(root==null)return;
            preorder(root.left);
            preorder(root.right);
            System.out.println(root.data+" ");
        }
        Node delete(Node root,int Element) {
            if (root == null) return null;
            if (Element < root.data)
                root.left = delete(root.left, Element);
            else if (Element > root.data)
                root.right = delete(root.right, Element);
            else {
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                Node succ = minValue(root.left);
                root.data = succ.data;
                root.right = delete(root.right, succ.data);

            }
            return root;
        }
        Node minValue(Node root){
            while (root.left!=null){
                root=root.left;
            }
            return root;
        }
    }

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        Binary b=new Binary();
        while(true){
            System.out.println("1.Insert\n2.Search\n3.Preorder\n4.Postorder\n5.Delete\n6.exit");
            System.out.println("Enter the choice");
            int choice=s.nextInt();

            switch (choice){

                case 1: 
            }
        }

    }
}
