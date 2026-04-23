package DSA.LinkedList1;

public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
 static  class LinkedList {
        Node head;
        int size=0;

        public void insert(int data) {
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
            size++;
        }
        public void insertAtEnd(int data){
            Node newNode=new Node(data);
            if(head==null){
                insert(data);
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }

     public int get(int idx){
            if(idx<0 || idx>=size){return -1;}
            Node temp=head;
           for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
     }

     public void insertAtMiddle(int idx,int data){
            if(idx==0){
                insert(data);
                return;
            }
            if(idx<0 || idx>size){return ;}
            Node temp=head;
            Node newNode=new Node(data);
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
     }
   public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println();
   }
   public int deletefirst(){
            int  val=head.data;
            head=head.next;
          size--;
            return val;
   }
   public int deleteatlast(){
            if(size==0){
                System.out.println("List is empty");
            }if(size==1){
                int val=head.data;
                head=null;
                size=0;
                return val;
       }
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
          int val=prev.next.data;
//            prev.next=null;
       prev.next=prev.next.next;
           size--;
      return val;
   }
   public void iterativ(int value) {
       if (head == null) {
           System.out.println("List is empyt");
           return;
       }
       int pos = 1;
       Node temp = head;
       while (temp != null) {
           if (temp.data == value) {
               System.out.println(pos);
               return;
           } else {
               temp = temp.next;
               pos++;
           }
       }
   }
public void reverse(){
            if(head==null){
                System.out.println("List is Empty:");
                return;
            }
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;

}
public Node combine(Node head) {
    Node temp = head;
    Node mid=divid(head);
    Node second=mid.next;
    mid.next=null;
    while (temp.next!= null) {
        temp=temp.next;
    }
    temp.next=second;
   return head;
}
public Node divid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
}
//     class Solution {
//         public ListNode deleteDuplicates(ListNode head) {
//             ListNode current = head;
//
//             while (current != null && current.next != null) {
//                 if (current.val == current.next.val) {
//                     current.next = current.next.next;   // skip duplicate
//                 } else {
//                     current = current.next;            // move forward
//                 }
//             }
//
//             return head;
//         }
//     }



 }

    public static void main(String[] args){
    LinkedList ll=new LinkedList();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insertAtMiddle(1,5);
      //  ll.print();
    //ll.deletefirst();
     //  ll.print();

     //  ll.deleteatlast();
     //  ll.print();
      // ll.iterativ(2);
     //  System.out.println( ll.get(2));
   // ll.reverse();
   // ll.print();

ll.head=ll.combine(ll.head);
ll.print();
//ll.print();











    }
}
