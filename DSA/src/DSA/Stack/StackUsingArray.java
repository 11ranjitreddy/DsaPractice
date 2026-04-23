package DSA.Stack;

public class StackUsingArray {
    static class Stack{
        int top=-1;
        int a[]=new int[5];

        void push(int x){
            if(top==a.length-1){
                System.out.println("Stack is overflow");
                return;
            }
            a[++top]=x;
        }
        void pop(){
            if(top==-1){
                System.out.println("Stack is empty");
                return;
            }
         System.out.println(a[top--]);

        }
        void peek(){
            System.out.println(a[top]);
        }
        void print(){
            if(top==-1){
                System.out.println("Stack is empty");
                return;
            }
            for(int i=top;i>=0;i--){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.peek();

        s.pop();
        s.print();










    }

}
