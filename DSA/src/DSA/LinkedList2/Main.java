package DSA.LinkedList2;

import java.util.List;

public class Main{
    public static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }}
    public static class LinkedList{
        Node head;

        public void insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public int countNode(){
            int count=0;
            if(head==null){
                return count;
            }
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public boolean search(int key){
            if(head ==null){
                return false;
            }
            Node temp=head;
            while(temp!=null){
                if(temp.data==key){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }

        //INSERTIONS
        //(1) INSERT AT END
        public  void insertatlast(int data){
            Node newNode=new Node(data);
            if(head==null){
                insert(data);
            }
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

        // INSERT AT POSITION
        public  void insertatpositon(int id,int data){
            Node newNode=new Node(data);
            if(head==null){
                insert(data);
            }
            Node temp=head,prev=null;
            for(int i=0;i<id-1;i++){

                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;

        }
        public  void insertafterNode(int data1,int data){
            if(head==null){
                insert(data);
            }
            Node temp=head;
            Node newNode=new Node(data);
            while (temp!=null){
                if(temp.data==data1){
                    newNode.next=temp.next;
                    temp.next=newNode;
                    return;
                };
                temp=temp.next;
            }
        }
        public void insertbeforeNode(int data1,int data){
            Node newNode=new Node(data);
            if(head==null){
                insert(data);
            }
            if(head.data==data1){
                newNode.next=head;
                return;
            }
             Node prev=null;
            Node temp=head;
            while(temp!=null && temp.data!=data1){
                prev=temp;
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Not found");
            }
            prev.next=newNode;
            newNode.next=temp;
        }


        //DELETION OPERATIONS

        public  void deleteatbegining(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }
        public void  deleteatlast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
      public void deleteposition(int id){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if(id==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=0;temp!=null && i<id-1;i++){

                temp=temp.next;
            }
           if(temp==null || temp.next==null){
               System.out.println("Invalid");
               return;
           }
           temp.next=temp.next.next;
      }

       public  void deletebykey(int key){
            if(head==null){
                System.out.println("Invalid");
                return;
            }
            if(head.data==key){
                head=head.next;
                return;
            }
            Node temp=head;
            while (temp!=null && temp.next.data!=key){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Invalid");
                return;
            }
            temp.next=temp.next.next;
       }
       public void deleteEntireList(){
            if(head==null){
                System.out.println("List is already empty");
                return;
            }
            head=null;
            System.out.println("List is empty now");
       }
       public void updateNode(int id,int data){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node newNode=new Node(data);
            if(id==0){
                newNode.next=head.next;
                head.next=newNode;
                return;
            }
            Node temp=head;
            for(int i=0;temp!=null && i<id-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next.next;
            temp.next=newNode;
       }

       //REVERSE
        public  void reverse(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node temp=head,prev=null;
            while (temp!=null){
              Node next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            head=prev;
        }
        public Node reverseRecursively( Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newNode=reverseRecursively(head.next);
            head.next.next=head;
            head.next=null;
            return newNode;
        }
        public  Node reverseInGroup(Node head,int k){
            Node curr=head;
            Node prev=null;
            int count=0;
            Node next=null;
            while(curr!=null && count<k){
                 next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if (next!=null){
                head.next=reverseInGroup(next,k);
            }
            return prev;
        }
        public Node reverseBetweendata(Node head,int m,int n){
            if(head==null)return head;

            Node temp=head;
            Node beforstart=null;
            while (temp!=null && temp.data!= m){
                beforstart=temp;
                temp=temp.next;
            }
            Node curr=temp;
            Node start=temp;
            Node prev=null;
            Node next=null;

            while (curr!=null && curr.data!=n){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
             next=curr.next;
            curr.next=prev;

            start.next=next;

            if(beforstart!=null){
                beforstart.next=curr;
            }else {
                head=curr;
            }
            return head;
        }
        public Node reversebypositions(Node head,int m,int n){
            if(head==null || m==n)return head;

            Node temp=head;
            Node berforestart=null;
            int id=0;
            while (temp!=null && id!=m){
                berforestart=temp;
                temp=temp.next;
                id++;
            }
            Node curr=temp;
            Node start=temp;
            Node prev=null;
            Node next=null;

            while (curr!=null && id!=n){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                id++;
            }
            if(curr==null)return head;

            next=curr.next;
            curr.next=prev;

            start.next=next;
            if(berforestart!=null){
                berforestart.next=curr;
            }else {
                head=curr;
            }
return head;
        }
        public Node findmiddle(){
            if(head==null)return head;

            Node slow=head;
            Node fast=head;

            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public void removemiddleNode(){
            if(head==null || head.next==null){
                head=null;
                return;
            }


            Node slow=head;
            Node fast=head;
            Node befor=null;
            while (fast!=null && fast.next!=null){
                befor=slow;
                slow=slow.next;
                fast=fast.next.next;

            }
            befor.next=slow.next;

        }
        public  Node  nthNode(int n){
            if(head==null)return head;

            Node first=head;
            Node second=head;
            for(int i=0;i<n;i++){
                if(first==null)return null;
                first=first.next;
            }
            while (first!=null){
                first=first.next;
                second=second.next;
            }
            return second;
        }
        public void removeNthNode(int n){
            if(head ==null)return ;
            Node first=head;
            Node second=head;
            Node temp=head;
            for(int i=0;i<n;i++){
                first=first.next;
            }
            while (first!=null){
                first=first.next;
                second=second.next;
                temp=temp.next;
            }
            temp.next=second.next.next;

        }
        public boolean iscycle(){
            if(head==null)return false;
            Node slow=head;
            Node fast=head;

            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            if(slow==fast)return true;

            return false;
        }
        public void RemoveCycle(){
            if(head ==null)return ;
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast){
                    cycle=true;
                    break;
                }
            }
            if(!cycle)return ;

            slow=head;
            if(slow==fast){
                while (fast.next!=slow)
                    fast=fast.next;
            }else {
                while (slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
            fast.next=null;
        }

        public Node mergerTwoShortedList(Node head,Node head1){

            Node dummy=new Node(-1);
            Node tail=dummy;

            while(head!=null && head1!=null){
                if(head.data<= head1.data){
                    tail.next=head;
                    head=head.next;
                }else{
                    tail.next=head1;
                    head1.next=head1;
                }
                tail=tail.next;
            }
            if(head!=null) tail.next=head;
            if(head1!=null) tail.next=head1;

            return dummy.next;
        }
        public Node mergeSort(Node head){
            if(head==null || head.next==null){
                return head;
            }

           Node mid=getmiddle(head);

            Node righthead=mid.next;
            mid.next=null;


            Node left=mergeSort(head);
            Node right=mergeSort(righthead);

            return merge(left,right);
        }
        public Node getmiddle(Node head){
            if(head==null)return head;

             Node slow=head;
             Node fast=head.next;

             while (fast!=null && fast.next!=null){
                 slow=slow.next;
                 fast=fast.next.next;
             }
           return  slow;
        }
        public Node merge(Node left,Node right){
            Node dummy=new Node(-1);
            Node temp=dummy;

            while (left!=null && right!=null){
                if(left.data<= right.data){
                    temp.next=left;
                    left=left.next;
                }
                else{
                    temp.next=right;
                    right=right.next;
                }
                temp=temp.next;
            }
            if(left!=null)temp.next=left;
            if(right!=null)temp.next=right;

            return dummy.next;
        }

        public void removeduplicate(){
            if(head==null)return;

            Node curr=head;

            while (curr!=null && curr.next!=null){
                if(curr.data== curr.next.data){
                    curr=curr.next.next;
                }else{
                    curr=curr.next;
                }
            }
        }
        public boolean palindrome(){
            Node middle=getmiddle(head);

            Node prev=null;
            Node curr=head;
            while (curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;
            Node left=head;

            while (right!=null){
                if(left.data!=right.data){
                    return false;
                }
                right=right.next;
            }
            return true;
        }
        public Node addition(Node list1,Node list2){

            Node dummy=new Node(0);
            Node curr=dummy;
            int carry=0;


            while (list1!=null || list2!=null || carry!=0){
                int sum=carry;

                if(list1!=null){
                    sum+=list1.data;
                    list1=list1.next;
                }
                if(list2!=null){
                    sum+=list2.data;
                    list2=list2.next;
                }
                carry=sum/10;
                curr.next=new Node(sum%10);
                curr=curr.next;
            }
           return dummy.next;
        }
        public Node multiplicatin(Node list1,Node list2){

            long num1=0,num2=0;
            int place=1;
            while(list1!=null){
                num1+=list1.data*place;
                place*=10;
                list1=list1.next;
            }
            place=1;
            while(list2!=null){
                num2+=list2.data*place;
                place*=10;
                list2=list2.next;
            }

            long product=num2*num1;
            if(product==0)
                return new Node(0);

            Node dummy=new Node(0);
            Node curr=dummy;
            while(product>0){
                curr.next=new Node((int)product%10);
                product=product/10;
                curr=curr.next;
            }

            return dummy.next;
        }
        public Node substraction(Node list1,Node list2){
            Node dummy=new Node(0);
            Node curr=dummy;
            int borrow=0;
            while(list1!=null){
                int diff=list1.data-borrow-(list2!=null?list2.data:0);
                if(diff<0){
                    diff+=10;
                    borrow=1;
                }else{
                    borrow=0;
                }
                curr.next=new Node(diff);
                curr=curr.next;
                list1=list1.next;
                if(list2!=null){
                    list2=list2.next;
                }
            }
            return dummy.next;
        }

        public  Node Rotate(Node head,int k){
            if(head==null || head.next==null || k==0)return head;

            int length=1;
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
                length++;
            }
            temp.next=head;
            k=k%length;
            int steps=length-k;

            Node newTail=head;
            for(int i=1;i<steps;i++){
                newTail=newTail.next;
            }
            Node  newHead=newTail.next;
            newTail.next=null;

            return newHead;
        }
        //CLONE
        public Node Clone(Node head){
            if(head==null)return head;

            Node newhead=new Node(head.data);
            Node Old=head.next;
            Node curr=newhead;

            while (Old!=null){
                curr.next=new Node(Old.data);
                curr=curr.next;
                Old=Old.next;
            }
            return newhead;
        }

        public Node covnertarraytolinkedlist(int num[]){

          Node newhead=new Node(num[0]);
          Node curr=newhead;

          for(int i=0;i<num.length;i++){
              curr.next=new Node(num[i]);
              curr=curr.next;
          }
          return newhead.next;
        }
        public int[] convertlinkedListToArray(Node head){

            Node temp=head;
            int size=0;
            while (temp!=null){
                temp=temp.next;
                size++;
            }
            temp=head;
            int num[]=new int[size];
            for(int i=0;i<size;i++){
                num[i++]=temp.data;
                temp=temp.next;
            }
            return num;
        }
        //INTERSECTION
        public Node intersection(Node head1,Node head2){
            Node p1=head1;
            Node p2=head2;
            while (p1!=p2){
                p1=(p1==null)?head2:p1.next;
                p2=(p2==null)?head1:p2.next;
            }
            return p1;

        }

    }


    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        LinkedList list1=new LinkedList();
        list1.insert(80);
        list1.insert(90);
        list1.insert(100);
        list1.display();
        System.out.println();
        list1.display();
        System.out.println();
        System.out.print(list.countNode());
        System.out.println();
        System.out.print(list.search(200));
        list.insertatlast(50);
        System.out.println();
        list.display();
        System.out.println();
        list.insertatpositon(2,60);
        list.display();
        System.out.println();
        list.insertafterNode(60,110);
        list.display();
        System.out.println();
        list.insertbeforeNode(60,35);
        list.display();
        list.deleteatbegining();
        System.out.println();
        list.display();
        System.out.println();
        list.deleteatlast();
        list.display();
        System.out.println();
        list.deleteposition(2);
        list.display();
        System.out.println();
        list.deletebykey(20);
        list.display();
        System.out.println();
//        list.deleteEntireList();
//        list.display();
//        System.out.println();
        list.updateNode(2,23);
        list.display();
        System.out.println();
        list.reverse();
        list.display();
        System.out.println();

        list.head=list.reverseRecursively(list.head);
        list.display();
        System.out.println();
        list.head=list.reverseInGroup(list.head,2);
        list.display();
        System.out.println();
        list.reverseBetweendata(list.head,35,40);
        list.display();
        System.out.println();
        list.reversebypositions(list.head,1,5);
        list.display();
        System.out.println();
        System.out.println((list.findmiddle()).data);
        list.removemiddleNode();
        list.display();
        System.out.println();
       System.out.println((list.nthNode(2)).data);
        list.removeNthNode(4);
        list.display();
        System.out.println();
//       System.out.println(list.iscycle());
//       list.head= list.mergeSort(list.head);
//       list.display();
//      list.removeduplicate();
//        System.out.println();
//      list.display();
//      System.out.println(list.palindrome());
//      list.head=list.addition(list.head,list1.head);
//      System.out.println();
//      list.display();
      list.head=list.Rotate(list.head,2);
      list.display();
      System.out.println();
      list.Clone(list.head);
      list.display();

    }
}