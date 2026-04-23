package DSA.LinkedList;

public class MainClass1 {

    static class Node{
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;

       public void insert(int data){
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

       public  void display(){
           if(head==null){
               System.out.println("List is empty");
               return;
           }
           Node temp=head;
           while(temp!=null){
               System.out.println(temp.data +" ");
               temp=temp.next;
           }
System.out.println();
       }

        public void search(int key) {
            Node temp = head;
            while (temp!=null){
                if(temp.data==key){
                    System.out.println("Element "+key+" is present");
                    return;
                }
              temp=temp.next;
            }
            System.out.println("Element " +key+"  is not present");
        }


       public void delete(int key){
           Node temp=head,prev=null;

           if(temp!=null && temp.data==key){
               head=temp.next;
               return;
           }
           while (temp!=null && temp.data!=key){
               prev=temp;
               temp=temp.next;
           }

           if(temp==null)return;
           prev.next=temp.next;
       }



    }
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insert(11);
        list.insert(12);
        list.search(12);
        list.insert(13);
        list.display();
        list.delete(12);
        list.search(12);
        list.display();
    }

}
