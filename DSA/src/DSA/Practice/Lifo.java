package DSA.Practice;

import java.util.Scanner;

public class Lifo {

    static final  int size=100;
    static int[] a=new int[size];
    static int top=-1;

    static void push(int value){
        if(top==size-1){
            System.out.println("size if full");
            return;
        }
         a[++top]=value;
        System.out.println("Value is inserted");
    }

    static void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;

        }
        System.out.println(a[top]+"poped");
         top--;

    }

    static void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(a[top]+"Peek element");
    }
    static void display(){
    if(top==-1){
        System.out.println("Stacak is empyt");
        return;

    }
    for (int i=0;i<=top;i++){
        System.out.println(a[i]);
    }
    }

    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("1.PUSH\n2.POP\n3.peek\n4.display\nEnter your choice");
       while (true){
           int choice=s.nextInt();

           switch (choice){
               case 1:System.out.println("Enter the value");
                      int value=s.nextInt();
                      push(value);
                      break;

               case 2:pop();
                      break;

               case 4:display();
                      break;

               case 3:peek();
                      break;

               default:System.out.println("Enter a valid choice");
                       return ;
           }
       }


    }











}
