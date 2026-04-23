package DSA.LinkedList;

public class DoubleLinked {

    static class  Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    static class DoubleLinkedList{
        Node head;

        void insert(int data){
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }


}
