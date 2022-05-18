package stack;

import java.util.Scanner;

public class main {

    public static void main(String []args){

        int maxSize, choice = 0;
        double ele;
        boolean ok;
        String status;

        Scanner Ob = new Scanner(System.in);
        System.out.println("Enter Stack size ");

        maxSize = Ob.nextInt();

        stackX stack = new stackX(maxSize);

        while (choice != 99){

            System.out.println("\n\n01. Do you want to add an element to the Stack\n" +
                    "02. Do you want to delete an element from the Stack\n" +
                    "03. Do you want to view top element of the Stack\n" +
                    "04. Do you want to view all elements of the Stack\n" +
                    "05. Do you want to know Stack is Full\n" +
                    "06. Do you want to know Stack is Empty\n" +
                    "07. Do you want to Exit from the process\n\n");

            choice =Ob.nextInt();

            switch (choice){

                case 1 : System.out.println("Enter element: ");
                    ele = Ob.nextDouble();
                    stack.push(ele);

                    break;

                case 2 : ele = stack.pop();
                    System.out.println("\nElement ["+ ((int) ele) +"] deleted from the stack..! \n\n");
                    break;

                case 3 : ele = stack.peek();
                    System.out.println("\nElement ["+ ((int) ele) +"] is top most element of the stack..! \n\n");
                    break;

                case 4 :
                    System.out.println("\nThis is the stack..! \n\n");
                    stack.viewStack();

                    break;

                case 5 :  ok = stack.isFull();
                     status = (ok == true) ? "\nThe stack is full..! \n\n" : "\nThe stack is not full..! \n\n";
                     System.out.println(status);
                     break;

                case 6 :  ok = stack.isEmpty();
                    status = (ok == true) ? "\nThe stack is Empty..! \n\n" : "\nThe stack is not Empty..! \n\n";
                    System.out.println(status);
                    break;

                case 7 :
                    System.out.println("\n\nBYE BYE\n\n");
                    choice = 99;
                     break;

                default:  System.out.println("\n\nInvalid entry ..!!\n\n");
            }

        }


    }

}