package DSA.LinkedList;

public class MainClass2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

         void insertatfirst(int data) {
            Node newNode = new Node(data);
                newNode.next=head;
                head=newNode;


        }
        void insertatlast(int data){
             Node newNode=new Node(data);
             if(head==null){
                 head=newNode;
                 return;
             }
             Node temp=head;
             while(temp.next!=null){
                 temp=temp.next;

             }
             temp.next=newNode;

        }

        void insertatmiddle(int index,int data){
             Node newNode=new Node(data);
             Node temp=head;
             int i=0;
             if(i<index-1){
                 temp=temp.next;
                 i++;
             }
             newNode.next=temp.next;
             temp.next=newNode;
        }


     void display(){
             Node temp=head;

             if(temp==null){
                 System.out.println("List is empty");
                 return;
             }
             while(temp!=null){
                 System.out.println(temp.data+ " ");
                 temp=temp.next;
             }
     }


    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insertatfirst(10);
        list.insertatfirst(20);
        list.insertatlast(30);
        list.insertatmiddle(2,80);
        list.insertatlast(40);
        list.display();
    }

}