package DSA.LinkedList2;

import DSA.DivideAndConqure.MergeSort;

public class PracticeLinkedList {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head;

        //BASIC OPERATIONS
        public void Insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                newNode.next=head;
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void display(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        public boolean search(int data){
            if(head==null)return false;
            Node temp=head;
            while (temp!=null){
                if(temp.data==data){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }

        //INSERTION OPERATIONS
        public void InsertAtEnd(int data){
            if(head==null){
                System.out.print("List is Empty");
                return;
            }
            Node newNode=new Node(data);
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
       public void InsertAtPosition(int id,int data){
            Node newNode=new Node(data);
            Node temp=head;
            for(int i=1;i<id;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
       }
       public void InsertBeforeNode(int data,int key){
            Node newNode=new Node(data);
            Node temp=head;

            while (temp!=null && temp.next.data!=key){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
       }

       public void InsertAfterANode(int data,int key){
            Node newNode=new Node(data);
            Node temp=head;
            while (temp!=null && temp.data!=key){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
       }

       //DELETION OPERATIONS

        public void DeleteFromBegining(){
            head=head.next;
        }
        public void DeleteFromEnd(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        public void DeleteAtPosition(int id){
            Node temp=head;

            for(int i=1;i<id-1;i++){
                temp=temp.next;
            }
                temp.next=temp.next.next;
        }
        public void DeleteByKey(int key){
            Node temp=head;
            while (temp!=null&& temp.next.data!=key){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        //UPDATE OPERATIONS
        public void UpdateNodeValue(int data,int id){
         //   Node newNode=new Node(data);
            Node temp=head;
            if(id==0){
         temp.data=data;
         return;
            }

            for(int i=0;i<id;i++){

                temp=temp.next;
            }
            temp.data=data;

        }

        //REVERSE OPERATIONS

        public void reverse(){
            Node temp=head;
            Node prev=null;

            while (temp!=null){
                Node next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            head=prev;
        }

        public void ReverseInGroup(int k){
            Node temp=head;
            Node prev=null;

            int i=0;
            while (k>i){
                Node next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
                i++;
            }
           head.next=temp;
            head=prev;
        }


        public void ReverseSublist(int left,int right){
            Node temp=head;
            Node prev=null;
            for(int i=1;i<left;i++){
                prev=temp;
                temp=temp.next;
            }
            Node start=temp;
            Node prev2=null;
            for(int i=left;i<=right;i++){
                Node next=temp.next;
                temp.next=prev2;
                prev2=temp;
                temp=next;
            }
            if(prev!=null){
                prev.next=prev2;
            }else {
                head=prev2;
            }
            start.next=temp;
        }
        public void ReverseAlternative(){
            Node curr=head;
            Node prev=null;
            Node Athead=null;

            while (curr!=null && curr.next!=null){
                Node temp=curr.next;
                curr.next=temp.next;

                temp.next=Athead;
                Athead=temp;
                curr=curr.next;
            }
            curr=head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=Athead;
        }
        public Node FindMiddle(){
            Node slow=head;
            Node fast=head.next;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public void RemoveMiddle(){
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
      public Node NthNode(int n){
            Node first=head;
            Node second=head;
            for(int i=0;i<n;i++){
                first=first.next;
            }
            while (first!=null){
                first=first.next;
                second=second.next;
            }
            return second;
      }
     public void RemoveNthNode(int n){
            Node first=head;
            Node second=head;
            for(int i=0;i<n;i++){
                first=first.next;
            }
            Node Nth=null;
            while (first!=null){
                first=first.next;
                Nth=second;
                second=second.next;
            }
            Nth.next=second.next;
     }
     public void makeCycle(){
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
     }
     public boolean iscycle(){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast)
                    return true;
            }
            return false;
     }
     public void removeCycle(){
         Node slow=head;
         Node fast=head;
         boolean iscycle=false;
         while (fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;

             if(slow==fast){
                 iscycle=true;
                 break;
             }
         }
         slow=head;
         if(slow==fast){
             while (fast.next!=slow){
                 fast=fast.next;
             }
         }else{
             while (fast.next!=slow.next){
                 slow=slow.next;
                 fast=fast.next;
             }
         }
         fast.next=null;
     }
  public int findcyclelength(){
            Node slow=head;
            Node fast=head;

            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    int length=1;
                    Node temp=slow.next;

                    while (temp!=slow){
                        length++;
                        temp=temp.next;
                    }
                }
            }
            return 0;
  }
  public Node findcyclestart(){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast){
                    slow=head;

                    while (slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                    }
                    return slow;
                }
            }
            return null;
  }
public Node MergeSort(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node mid=FindMiddle();
            Node rightpart=mid.next;
            mid.next=null;
            Node left=MergeSort(head);
            Node right=MergeSort(rightpart);

            return Merge(left,right);

}
public  Node Merge(Node left,Node right){
            Node dummy=new Node(-1);
            Node tail=dummy;
            while (left!=null && right!=null){
                if(left.data<=right.data){
                    tail.next=left;
                    left=left.next;
                }else{
                    tail.next=right;
                    right=right.next;
                }
                tail=tail.next;
            }
            if(left!=null)tail.next=left;
            if(right!=null)tail.next=right;
            return dummy.next;
}
public  void removeduplicates(){
            Node temp=head;
            while (temp!=null && temp.next!=null){
                if(temp.data==temp.next.data){
                    temp=temp.next.next;
                }else {
                    temp=temp.next;
                }
            }
}
public boolean palindrom(){
            Node temp=head;
            Node prev=null;
            while (temp!=null){
                Node next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            Node right=prev;
            Node start=head;
            while (right!=null){
                if(right.data!=start.data){
                    return false;
                }
                right=right.next;
            }
            return  false;
}

public Node addition(Node list1,Node list2){
            Node dummy=new Node(-1);
            Node temp=dummy;
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
                temp.next=new Node(sum%10);
                temp=temp.next;
            }
            return dummy.next;
}

    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        list.Insert(40);
        list.Insert(50);
        LinkedList list1=new LinkedList();
        list1.Insert(20);
        list1.Insert(40);
        list1.Insert(30);
        list1.Insert(10);
        list.display();
        System.out.println();
       System.out.print( list.search(30));
        list.InsertAtEnd(60);
        System.out.println();
        list.display();
        System.out.println();
      list.InsertAtPosition(2,70);
      list.display();
      list.InsertBeforeNode(80,30);
      System.out.println();
      list.display();
      list.InsertAfterANode(90,80);
      System.out.println();
      list.display();
      System.out.println();
      list.DeleteFromBegining();
      list.display();
      list.DeleteFromEnd();
      System.out.println();
      list.display();
      System.out.println();
      list.DeleteAtPosition(3);
      list.display();
      System.out.println();
      list.DeleteByKey(90);
      list.display();
      list.UpdateNodeValue(80,3);
      System.out.println();
      list.display();
      System.out.println();
      list.UpdateNodeValue(60,1);
      list.display();
      System.out.println();
      list.reverse();
      list.display();
      System.out.println();
      list.ReverseInGroup(3);
      list.display();
      System.out.println();
      list.ReverseSublist(2,4);
      list.ReverseAlternative();
      list.display();
      System.out.println();
      System.out.print((list.FindMiddle().data));
      System.out.println();
      list.RemoveMiddle();
      list.display();
      System.out.println();
      System.out.print((list.NthNode(2)).data);
      list.RemoveNthNode(2);
      System.out.println();
      list.display();
      System.out.println();
     // list.makeCycle();
      System.out.print(list.iscycle());
      list.display();
      System.out.println();
     list.head= list.MergeSort(list.head);
      list.display();



    }
}
