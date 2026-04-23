package DSA.Tree1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinartSearchTree1 {

    public  static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree{
        Node root;

        Node insert(Node root,int data){
            if(root==null)return new Node(data);
            else if(data<root.data)root.left=insert(root.left,data);
            else root.right=insert(root.right,data);
            return root;
        }
        void preorder(Node root){
            if(root==null)return;
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        int kthelement(Node root,int k){
            if(root==null)return -1;
           Queue<Node> qq=new LinkedList<>();
            qq.add(root);
            int count=1;
            while (!qq.isEmpty()){
                Node currnode=qq.remove();
                count++;
                if(count==k)
                   return currnode.data;
                if(currnode.left!=null)qq.add(currnode.left);
                if(currnode.right!=null)qq.add(currnode.right);
            }
            return -1;
        }
        void levelOrder(Node root){
            if(root==null)return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        }
        int heightlevel(Node root){
            if(root==null)return 0;
            Queue<Node>h=new LinkedList<>();
            h.add(root);
            int level=0;
            while(!h.isEmpty()){
                int size=h.size();
                while(size-->0){
                    Node current=h.remove();
                    if(current.left!=null)h.add(current.left);
                    if(current.right!=null)h.add(current.right);
                }
                level++;
            }
            return level;
        }
        void kthlevle(Node root,int kk){
            if(root==null)return;
            if(kk==1){
                System.out.print(root.data+" ");
                return;
            }
            kthlevle(root.left,kk-1);
            kthlevle(root.right,kk-1);
        }
        public static boolean getPath(Node root,int n,ArrayList<Node>path){
            if(root==null)
                return  false;

            path.add(root);
            if(root.data ==n)
                return true;

            boolean foundleft=getPath(root.left,n,path);
            boolean foundright=getPath(root.right,n,path);
            if(foundleft || foundright)
                return true;
            path.remove(path.size()-1);
            return false;

        }

        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i=0;
            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lca=path1.get(i-1);
            return lca;
        }
        Node lowcommonancestor(Node root,int n1,int n2){
            if(root==null)return  null;
            if(n1>root.data && n2> root.data)return lowcommonancestor(root.right,n1,n2);
            if(n2<root.data && n2< root.data)return  lowcommonancestor(root.left,n1,n2);
            return root;
        }

    }

    public static void main(String args[]){
        BinaryTree b=new BinaryTree();
        int a[]={50,40,30,35,20,10,60,55,70,80,90};
        for(int x:a)
            b.root=b.insert(b.root,x);
        b.preorder(b.root);
        System.out.println();
        b.levelOrder(b.root);
        System.out.println();
       System.out.print(b.kthelement(b.root,3));
       System.out.println();
       System.out.print(b.heightlevel(b.root));
       System.out.println();
       b.kthlevle(b.root,3);
       System.out.println((b.root=b.lca(b.root,35,80)).data);
       System.out.println();
       Node ans=b.lowcommonancestor(b.root,40,60);
       System.out.print(ans.data);
    }
}
