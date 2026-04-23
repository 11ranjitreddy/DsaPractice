package DSA.LinkedList1;

public class LLP {
    class Node{
        int data;Node next;
        Node(int data){
            this.data=data;
            this.next=null;}}
    Node head;int size=0;
    public void insert(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;}
    public void print(){
        if(head==null){System.out.println("List is empty: ");return;}
        Node temp=head;
        while(temp!=null){System.out.print(temp.data+"-> ");
            temp=temp.next;}
        System.out.println();}
    public void insertlast(int val){
        if(head==null){insert(val);return;}
        Node temp=head;
        Node newNode=new Node(val);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addmiddle(int idx,int val){
        if(idx==0){insert(val);return;}
        Node temp=head;
        Node newNode=new Node(val);
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
         newNode.next=temp.next;
        temp.next=newNode;
    }

    public void removefirst(){
        if(head==null){System.out.println("List is empty:");return ;}
//        int val=head.data;
        head=head.next;
       // return val;
    }
  public void removeatlast(){
        if(head==null){System.out.println("Empty:");return;}
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
  }
  public void removeatindex(int idx){
        if(head==null){System.out.println("Empty");return;}
        if(idx==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            if(temp.next==null){return;}
            temp=temp.next;
        }
        if(temp.next==null){return;}
        temp.next=temp.next.next;
  }
 public void iterative(int value){
        if(head==null){System.out.println("List is Empty");return;}
       while(head!=null && head.data==value){
           head=head.next;
       }
       Node temp=head;
       while(temp!=null && temp.next!=null){
           if(temp.next.data==value){
               temp.next=temp.next.next;
           }else{
               temp=temp.next;
           }
       }
 }
 public void reverse(){
        if(head==null){System.out.println("Empty");return;}
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
public Node palindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
}
public boolean ispalindrome(){
        Node middle=palindrome(head);
        Node prev=null;
        Node curr=middle;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
}
public boolean iscycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
}

public Node midreverse(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
}
public void reorder(Node head){
        Node prev=null;
        Node mid=midreverse(head);
        Node curr=mid.next;
       mid.next=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;

      while(right!=null){
          Node t1=left.next;
    Node t2=right.next;

    left.next=right;
    right.next=t1;

    left=t1;
    right=t2;

    }


}






    public static void main(String args[]){
        LLP ll=new LLP();
//        ll.head=ll.new Node(10);
//        ll.head.next=ll.new Node(20);
//        ll.head.next.next=ll.new Node(30);
       // ll.head.next.next.next=ll.head;
        ll.insert(30);
        ll.insert(20);
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
//       // ll.insertlast(20);
//        //ll.addmiddle(2,50);
//       ll.print();
//       // ll.removefirst();
//       // ll.removeatlast();
//      //  ll.removeatindex(1);
//      // ll.iterative(20);
//        ll.reverse();
//       System.out.println( ll.ispalindrome());
        ll.print();
        ll.reorder(ll.head);
        ll.print();
     //   System.out.println(ll.iscycle(ll.head));
    }
}
