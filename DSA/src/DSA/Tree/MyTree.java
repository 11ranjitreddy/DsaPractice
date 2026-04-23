package DSA.Tree;

import java.util.Scanner;

public class MyTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        Node root;

        Node insert(Node root, int value) {
            if (root == null)
                return new Node(value);
            else if (value < root.data)
                root.left = insert(root.left, value);
            else root.right = insert(root.right, value);
            return root;
        }

        boolean search(Node root, int key) {
            if (root == null) return false;
            else if (key == root.data) return true;
            return key < root.data ? search(root.left, key) : search(root.right, key);
        }
        void PreOrder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        void PostOrder(Node root) {
            if (root == null) return;
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        void InOrder(Node root) {
            if (root == null) return;
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        BinaryTree t = new BinaryTree();
        while (true) {
        System.out.println("Enter the Choice\n1.Insert\n2.Search\n3.PreOrder\n4.PostOrder\n5.InOrder");
        int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size: ");
                    int size=s.nextInt();
                    System.out.println("Enter the Elements: ");
                    int a[]=new int[size];
                    for(int i=0;i<size;i++)
                        a[i]=s.nextInt();

                    for(int x:a){
                    t.root = t.insert(t.root, x);}
                    System.out.println("Value is Inserted ");
                    break;

                case 2:
                    System.out.println("Enter the Key");
                    int key = s.nextInt();
                    boolean found = t.search(t.root, key);
                    System.out.println(found ? "Found" : "NotFound");
                    break;

                case 3:
                    System.out.println("PreOrder: ");
                    t.PreOrder(t.root);
                    break;

                case 4:
                    System.out.print("PostOrder: ");
                    t.PostOrder(t.root);
                    break;

                case 5:
                    System.out.print("InOder: ");
                    t.InOrder(t.root);
                    break;

                default:
                    System.out.println("Enter the valid choice: ");
            }
        }
    }
}