package DSA.LinkedList;
import java.util.Scanner;

public class MainClass3 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }


        public static class LinkedList {
            Node head;

            public void insertAtFirst(int data) {
                Node newNode = new Node(data);
                newNode.next=head;
                head=newNode;
            }


            public void insertAtLast(int data){
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
             public void insertAtAny(int index,int data){
                Node newNode=new Node(data);
                Node temp=head;
                int i=0;
                while(i<index-1 && temp!=null){
                    temp=temp.next;
                    i++;
                }
                newNode.next=temp.next;
                temp.next=newNode;
             }


             public void removeFirst(){
                if(head==null){
                    System.out.println("List is empty");
                    return;
                }
                head=head.next;
           }
           public void removeLast(){
                if(head==null){
                    System.out.println("List is empty");
                    return;
                }
                if(head.next==null){
                    head=null;
                    return;
                }
                Node temp=head;
                while (temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
           }

           public void removeAnywhere(int index){
                if(index ==0){
                  head=head.next;
                    return;
                }
                Node temp=head;
                int i=0;
                while(i<index-1 && temp.next!=null){
                    temp=temp.next;
                    i++;
                }
                if(temp.next==null){
                    System.out.println("Index is out of range");
                }
           }

            public void display(){
                if(head==null){
                    System.out.println("List is empty");
                }
                Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data+" ");
                    temp=temp.next;
                }
            }




        }
        public static void main(String args[]){
            LinkedList list=new LinkedList();
            Scanner s=new Scanner(System.in);
            int data,choice;



            do{
                System.out.println("1.Insert at First\n2.Insert at Last\n3.Insert at Anywhere\n4.Remove at First\n5.Remove at Last\n6.Remove at Anywhere\n7.Display\n8.exit\nCHOOSE YOUR CHOICE:");
                choice=s.nextInt();

                switch (choice){

                    case 1: System.out.println("Enter the value: ");
                             data=s.nextInt();
                             list.insertAtFirst(data);
                             break;

                    case 2: System.out.println("Enter the value: ");
                             data=s.nextInt();
                             list.insertAtLast(data);
                             break;

                    case 3: System.out.println("Enter the value: ");
                             data=s.nextInt();
                            System.out.println("Enter the Index: ");
                            int index=s.nextInt();
                             list.insertAtAny(index,data);
                             break;
                    case 4: list.removeFirst();
                              break;
                    case 5: list.removeLast();
                               break;
                    case 6: System.out.println("Enter the index:");
                            index=s.nextInt();
                             list.removeAnywhere(index);
                             break;
                    case 7:list.display();
                            break;
                    case 8:System.out.println("Deleting");
                           break;
                    default:System.out.println("Enter the valid choice:");
                             return;

                }
            }while(choice!=8);
        }

    }

}














