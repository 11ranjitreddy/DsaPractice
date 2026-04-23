package DSA.LinkedList1;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void insertLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
                    temp=temp.next;
        }
    }
    public static void insertAtMiddle(int idx,int data){
        if(idx==0){
            insert(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void sizee(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        System.out.println(size);
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertAtMiddle(2,5);
        ll.print();
        ll.sizee();
































    }
}
