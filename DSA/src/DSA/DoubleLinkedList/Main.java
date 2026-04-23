package DSA.DoubleLinkedList;

public class Main {

    public static class Node{
        Node prev,next;
        int data;
        Node (int data){
            this.data=data;
        }
    }
    public static class DoubleLinkedList{
        Node head;

        public void insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            head.prev=newNode;
            newNode.next=head;

            head=newNode;
        }
        public void display(){
            if(head==null){
                System.out.println("List is Empyt");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        public void delete(Node head,int key){
            if(head==null){
                System.out.print("List is empyt");
                return;
            }
        }
    }

    public static void main(String args[]){
        DoubleLinkedList list=new DoubleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }
}
