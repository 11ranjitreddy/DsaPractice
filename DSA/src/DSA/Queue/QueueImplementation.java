package DSA.Queue;

import java.util.Scanner;

public class QueueImplementation {
    static final int size = 100;

    static int queue[] = new int[100];
   static  int rear = -1, front = -1;

    static void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is overflow");
            return;
        }
        if(front==-1)
            front=0;
        queue[++rear]=value;
        System.out.println("Queue is inserted");
    }

    static void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue is empty:");
            return;
        }
        System.out.println("Deuqued:"+queue[front]);
        front++;
        if(front>rear)
            front=rear=-1;
    }

    static void display(){
        if(front==-1){
            System.out.println("Queue is empty:");
        return;
    }
        for (int i = front; i < rear; i++) {
            System.out.print("Display" + queue[i]);
        }
        System.out.println();
    }


    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("1.ENQUEUE\n2.DEQUEUE\n,3.DISPLAY\n");
        System.out.println("Enter Your choice:");

        int choice=s.nextInt();
        switch(choice){
            case 1: System.out.println("Enter the value: ");
                int value=s.nextInt();
                enqueue( value);
                break;

            case 2: dequeue();
                      break;

            case 3: display();
                    break;

            default:System.out.println("choose the valid choice: ");
        }
    }

}