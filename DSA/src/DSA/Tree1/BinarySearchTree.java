//package DSA.Tree1;
//
//import DSA.LinkedList1.LinkedList2;
//
//import java.util.*;
//public class BinarySearchTree {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data=data;
//        }
//    }
//    static class BinaryTree{
//        Node root;
//
//        public Node insert(Node root,int value){
//            if(root==null)return new Node(value);
//            else if(value<root.data) root.left=insert(root.left,value);
//            else root.right=insert(root.right,value);
//            return root;
//        }
//        public void preOrder(Node root){
//            if(root ==null)return;
//            System.out.print(root.data+" ");
//            preOrder(root.left);
//            preOrder(root.right);
//        }
//        public void inOrder(Node root){
//            if(root==null)return;
//            inOrder(root.left);
//            System.out.print(root.data+" ");
//            inOrder(root.right);
//        }
//        public void postOrder(Node root){
//            if(root==null)return;
//            preOrder(root.left);
//            preOrder(root.right);
//            System.out.print(root.data+" ");
//        }
//        public int MaxDepth(Node root){
//            if(root==null)return 0;
//            return 1+Math.max(MaxDepth(root.right),MaxDepth(root.left));
//        }
//        public int MinDepth(Node root){
//            if(root==null)return 0;
//            if(root.left==null) return 1+MinDepth(root.right);
//            if(root.right==null) return 1+MinDepth(root.left);
//            return 1+Math.min(MinDepth(root.left),MinDepth(root.right));
//        }
//        public int height(Node root){
//            if(root==null)return 0;
//            return 1+Math.max(height(root.left),height(root.right));
//        }
//        public int countNodes(Node root){
//            if(root==null)return 0;
//            return 1+countNodes(root.right)+countNodes(root.left);
//        }
//        public void LevelOrder(Node root){
//            if(root==null)return;
//
//            Queue<Node> q=new LinkedList<>();
//            q.add(root);
//            q.add(null);
//            while (!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                    System.out.println();
//                    if(q.isEmpty()){
//                        break;
//                    }else{
//                        q.add(null);
//                    }
//                }else{
//                    System.out.println(currNode.data+"");
//                    if(currNode.left!=null)
//                        q.add(currNode.left);
//                    if(currNode.right!=null)
//                        q.add(currNode.right);
//                }
//            }
//        }
//        public void levleOrder1(Node root){
//            if(root==null)return;
//            Queue<Node> q=new LinkedList<>();
//            q.add(root);
//            while (!q.isEmpty()){
//                Node curr=q.remove();
//                if(curr==null){
//                    if(q.isEmpty()){
//                        break;
//                    }else{
//                        q.add(null);
//                    }
//                }else{
//                    System.out.print(curr.data+" ");
//                    if(curr.left!=null)q.add(curr.left);
//                    if(curr.right!=null)q.add(curr.right);
//                }
//            }
//
//        }
//        public int sum(Node root){
//          if(root==null)return 0;
//          int left=sum(root.left);
//          int right=sum(root.right);
//          return left+right+root.data;
//        }
//        public int Diameter(Node root){
//            if(root==null)return 0;
//            int leftdiam=Diameter(root.left);
//            int rightdiam=Diameter(root.right);
//            int leftht=height(root.left);
//            int rightht=height(root.right);
//            int self=leftht+rightht+1;
//
//            return Math.max(self,Math.max(leftdiam,rightdiam));
//        }
//        public static void kthlevel(LinkedList2.Node root, int level, int k){
//
//            if(root==null)return;
//
//            if(level==k)
//            { System.out.print(root.data+" ");
//                return;}
//
//            kthlevel(root.left,level+1,k);
//            kthlevel(root.right,level+1,k);
//        }
//
//        public static boolean issubtree(LinkedList2.Node root, LinkedList2.Node subroot){
//            if(root==null)return false;
//            if(subroot==null)return true;
//
//            if(root.data==subroot.data){
//                if(isidentical(root,subroot))
//                    return true;
//            }
//
//            return issubtree(root.left,subroot)||issubtree(root.right,subroot);
//        }
//
//        public static boolean isidentical(LinkedList2.Node root, LinkedList2.Node subroot){
//
//            if(root==null && subroot==null)return true;
//
//            if(root==null || subroot==null||root.data!=subroot.data)return false;
//
//            if(!isidentical(root.left,subroot.left))return false;
//            if(!isidentical(root.right,subroot.right))return false;
//
//            return true;
//        }
//    }
//
//
//    public static void main(String args[]){
// BinaryTree b=new BinaryTree();
// int a[]={50,40,30,20,10,60,70,80,25,35,45,55,65,75};
// for(int n:a){
//     b.root=b.insert(b.root,n);
// }
// //b.preOrder(b.root);
// //b.postOrder(b.root);
// // b.inOrder(b.root);
//        System.out.println(b.Diameter(b.root));
//        System.out.println(b.sum(b.root));
//        b.levleOrder1(b.root);
//System.out.println(b.MinDepth(b.root));
//System.out.println(b.MaxDepth(b.root));
//    }
//}
