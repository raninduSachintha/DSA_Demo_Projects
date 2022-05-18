package stack;

public class stackX {

    private double []stkArray;
    private int maxSize;
    private int top;

    //overloaded constructor
    public stackX(int maxSize){

        this.maxSize = maxSize;
        stkArray = new double[maxSize];
        top = -1;   // top is not pointed to any element in stack(empty stack)

    }

    public void push(double value){

        if(top != maxSize - 1){

            stkArray[++top] = value;

            //top++;
            //stkArray[top] = value;
            System.out.println("\nElement added to the stack..! \n\n");
        }else{
            System.out.println("Stack is full ");
        }


    }

    public double pop(){

        if (top != -1)
            return stkArray[top--];

        else {
            System.out.println("Stack is Empty ");
            return -99;
        }

    }

    public double peek(){

        if (top != -1)
            return stkArray[top];

        else {
            System.out.println("Stack is Empty ");
            return -99;
        }

    }

    public boolean isFull(){

        return (top == maxSize - 1);
    }

    public boolean isEmpty(){

        return (top == -1);
    }

    public void viewStack(){

        if(top != -1){

            int i = top;
            while ( i != -1){

                System.out.println("Element "+ i + " --> " + ((int) stkArray[i])+"\n");
                i--;

            }

        }else
            System.out.println("Stack is Empty ");

    }

}
