package DSA.Stack;

public class StackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     static class Stack {
       Node head;
        public  boolean isEmpty() {
            return head==null;
        }
    public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

    }

    public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
    }
    public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
    }
    public void print(){
            if(isEmpty()){
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
    }

    public int deleteatbottom(){
            if(head==null){return -1 ;}

            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            int val=temp.data;
            temp.next=temp.next.next;
            return val;
    }

    public Node reverse(){
            if(head==null){
                return null;
            }
            Node prev=null;
            Node curr=head;

            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            return prev;
    }

    }
public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
       // s.pop();
       // s.print();
       // s.deleteatbottom();
        s.head=s.reverse();
        s.print();
}


}
