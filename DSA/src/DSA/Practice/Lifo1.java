package DSA.Practice;

import java.util.Scanner;
import java.util.Stack;

public class Lifo1 {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);


        while (true) {
            System.out.println("1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\nEnter your choice");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value");
                    int value = s.nextInt();
                    stack.push(value);
                    System.out.println(+value + "Inserted");
                    break;


                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");

                    }
                    System.out.println(stack.pop() + "Popped");
                    break;


                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");

                    }
                    System.out.println(stack.peek());
                    break;

                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");

                    }
                    System.out.println("Elements are" + stack);
                    break;

                case 5:
                    System.out.println("Existing program");
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("invalid choice");

            }

        }

    }
}