package DSA.Tree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree3 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static class BinaryTree{
        Node root;
        Node Subroot;
        //INSERTION
        Node insert(Node root,int data){
            if(root==null)return new Node(data);
            else if (data<root.data)
                root.left=insert(root.left,data);
            else
                root.right=insert(root.right,data);
            return root;
        }
        //SUBROOT
        Node insertSubroot(Node Subroot,int value){
            if(Subroot==null)return new Node(value);
            else if(value<Subroot.data)Subroot.left=insertSubroot(Subroot.left,value);
            else Subroot.right=insertSubroot(Subroot.right,value);
            return Subroot;
        }
        //PREORDER
        void preorder(Node root){
            if(root==null)return;
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //PREORDERSUBROOT
        void preorderSubroot(Node Subroot){
            if(Subroot==null)return;
            System.out.print(Subroot.data+" ");
            preorderSubroot(Subroot.left);
            preorderSubroot(Subroot.right);
        }
        //HEIGHT
        int height(Node root){
            if(root==null)return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
        //LEVELORDER
        void levelorder(Node root){
            if(root==null)return;
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                }else{
                    System.out.print(curr.data+"->");
                    if(curr.left!=null)q.add(curr.left);
                    if(curr.right!=null)q.add(curr.right);
                }
            }
        }
        //COUNTNODES
        int countNodes(Node root){
            if(root==null)return 0;
            return 1+countNodes(root.left)+countNodes(root.right);
        }
        //SUMOFNODES
        int sumofNodes(Node root){
            if(root==null)return 0;
            int leftsum=sumofNodes(root.left);
            int rightsum=sumofNodes(root.right);
            int rootsum=root.data;
            return leftsum+rightsum+rootsum;
        }
        //MINIMUMDEPTH
        int mindepth(Node root){
            if(root==null)return 0;
            if(root.right==null)return 1+mindepth(root.left);
            if(root.left==null)return 1+mindepth(root.right);
            return 1+Math.min(mindepth(root.right),mindepth(root.left));
        }
        //MAXIMUMDEPTH
        int maximumDiameter(Node root){
            if(root==null)return 0;
            int leftDiam=maximumDiameter(root.left);
            int rightDiam=maximumDiameter(root.right);
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int self=leftheight+rightheight+1;
            return Math.max(self,Math.max(leftDiam,rightDiam));
        }
        //KTHLEVELORDER
        void kthlevel(Node root,int k){
            if(root==null)return ;
            if(k==1)
                System.out.print(root.data+" ");
            kthlevel(root.left,k-1);
            kthlevel(root.right,k-1);
        }
        //SUBTREE
        public static boolean issubtree(Node root,Node Subroot){
            if(root==null)return false;
            if(Subroot==null)return true;

            if(root.data==Subroot.data)
            {
                if(isidentical(root,Subroot))
                    return true;
            }
            return issubtree(root.left,Subroot)||issubtree(root.right,Subroot);
        }
        public static boolean isidentical(Node root,Node Subroot){
            if(root==null && Subroot==null)return true;
            if(root==null||Subroot==null||root.data!=Subroot.data)return false;
            if(!isidentical(root.left,Subroot.left))return false;
            if(!isidentical(root.right,Subroot.right))return false;
            return true;
        }
        //LOWEST COMMON ANSCESTOR
        public Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();
            getPath(root,n1,path1);
            getPath(root,n2,path2);
            int i=0;
            for(;i<path1.size()&&i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lcanode=path1.get(i-1);
            return lcanode;
        }
        public boolean getPath(Node root,int n,ArrayList<Node>path){
            if(root==null)return false;
            path.add(root);
            if(root.data==n)return true;

            boolean findleft=getPath(root.left,n,path);
            boolean findright=getPath(root.right,n,path);
            if(findleft||findright)return true;
            path.remove(path.size()-1);
            return false;
        }
        //LOWESTCOMMONANCESTORBST
        public Node lowestcommonancestor(Node root,int n1,int n2){
            if(root==null)return null;
            if(n1>root.data&&n2>root.data)return lowestcommonancestor(root.right,n1,n2);
            if(n2<root.data&&n2<root.data)return lowestcommonancestor(root.left,n1,n2);
            return root;
        }
       //MINIMUMDISTANCEBETWEENTWONODES
       public int MinimuDistanceBetweenTwoNodes(Node root,int n1,int n2){
           ArrayList<Node> path1=new ArrayList<>();
           ArrayList<Node> path2=new ArrayList<>();
           getPath(root,n1,path1);
           getPath(root,n2,path2);
           int i=0;
         while(i<path1.size()&&i<path2.size()){
               if(path1.get(i)!=path2.get(i))
                   break;
                i++;
           }
           int distance=(path1.size()-i)+(path2.size()-i);
         return distance;
       }
       //KTHANCESTOR
        public Node KthAncestor(Node root,int target,int k){
            ArrayList<Node>kpath=new ArrayList<>();
            getPath(root,target,kpath);
            int index=kpath.size()-k-1;
            return kpath.get(index);
        }
        //TRANSFORMTOSUMTREE
        public int transformtosumtree(Node root){
            if(root==null)return 0;
            int leftsum=transformtosumtree(root.left);
            int rightsum=transformtosumtree(root.right);
            int oldvalue=root.data;
            root.data=leftsum+rightsum;
            return oldvalue+root.data;
        }
        public void inorder(Node root){
            if(root==null)return;
            inorder(root.left);
            System.out.print(root.data+"-> ");
            inorder(root.right);
        }
        public boolean search(Node root,int key){
            if(root==null)return false;
            if(key==root.data)return true;
            return search(root.left,key)||search(root.right,key);
        }
        public Node Mirror(Node root){
            if(root==null)return null;
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
            return root;
        }
        public Node delete(Node root,int key){
            if(root==null)return null;
            if(key<root.data) root.left=delete(root.left,key);
            else if(key>root.data) root.right=delete(root.right,key);
            else {
                if(root.left==null)return root.right;
                if(root.right==null)return root.left;
                Node successor=min(root.right);
                root.data=successor.data;
                root.right=delete(root.right,successor.data);
            }
            return root;
        }
        Node min(Node root){
            while (root.left!=null) root=root.left;
            return root;
        }
        public void printInRange(Node root,int k1,int k2){
            if(root==null)return;
            if(k1>root.data)
                printInRange(root.right,k1,k2);
            else if(k2<root.data)
                printInRange(root.left,k1,k2);
            else {
                printInRange(root.left,k1,k2);
                System.out.print(root.data+" ");
                printInRange(root.right,k1,k2);
        }
        }
        public static void printpath(ArrayList<Node>path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i).data+" ->");
            }
            System.out.println();
        }

        public static void path(Node root,ArrayList<Node>path){
            if(root==null)return;
            path.add(root);
            if(root.left==null && root.right==null){
                printpath(path);
            }
            path(root.left,path);
            path(root.right,path);
            path.remove(path.size()-1);
        }
    }
    public static void main(String arg[]){
    BinaryTree b=new BinaryTree();
    int a[]={50,40,30,45,20,10,60,70,80,90};
    for(int x:a)
        b.root=b.insert(b.root,x);
    int arr[]={20,10};
    for(int y:arr)
        b.Subroot=b.insertSubroot(b.Subroot,y);
    b.preorder(b.root);
    System.out.println();
    b.preorderSubroot(b.root);
    System.out.println();
    System.out.print(b.height(b.root));
    System.out.println();
    System.out.print(b.mindepth(b.root));
    System.out.println();
    b.levelorder(b.root);
    System.out.println();
    System.out.print(b.countNodes(b.root));
    System.out.println();
    System.out.print(b.sumofNodes(b.root));
    System.out.println();
    System.out.print(b.maximumDiameter(b.root));
    System.out.println();
    b.kthlevel(b.root,3);
    System.out.println();
    System.out.println(b.issubtree(b.root,b.Subroot));
    Node ans=b.lca(b.root,40,60);
    System.out.print(ans.data);
    System.out.println();
    Node ans1=b.lowestcommonancestor(b.root,40,60);
    System.out.print(ans1.data);
    System.out.println();
    int min=b.MinimuDistanceBetweenTwoNodes(b.root,40,60);
    System.out.print(min);
    System.out.println();
    Node ktelement=b.KthAncestor(b.root,10,2);
    System.out.print(ktelement.data);
    System.out.println();
//    System.out.print(b.transformtosumtree(b.root));
//    System.out.println();
//    b.inorder(b.root);
//    System.out.println();
//    System.out.print(b.search(b.root,40));
//    System.out.println();
//    System.out.print((b.root=b.Mirror(b.root)).data);
//        System.out.println();
//        b.preorder(b.root);
      //  b.root=b.delete(b.root,30);
//        b.preorder(b.root);
//        System.out.println();
//        b.printInRange(b.root,30,80);
//        System.out.println();
        b.path(b.root,new ArrayList<>());
    }

}
