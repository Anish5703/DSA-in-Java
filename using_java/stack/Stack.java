 class StackOperation
{
    private int maxSize;   //storing limit
    private int top;       //refers to the top index
    private int[] stackArray; //an array to implement as Stack;
    public int element;

    //constructor
    public StackOperation(int maxSize)
    {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
    }
    //method to check if the stack is empty
    public boolean isEmpty()
    {
        return top<0;
    }
    //method to check if the stack is full
    public boolean isFull()
    {
        return top==maxSize-1;
    }
    //method to push an element
    public void push(int element)
    {
      if(!isFull())
        {
            stackArray[top++] = element;
            System.out.println("element Pushed!!");
        }
        else
            System.out.println("Stack is Full");
    }
    //method to pop an element
    public int pop()
    {
        if(!isEmpty())
           return   element=stackArray[top--];
        else 
        {
          System.out.println("Stack is Empty");
          return -1;
        }
    }
    //method to peek the top element of stack
    public int peek()
      {
        if(!isEmpty())
        return stackArray[top];
        else
         return -1;
      }
    //method to print stack
    public void stackPrint()
    {
        if(!isEmpty())
        {
            System.out.printf("Stack list: ");
            do
            {
               System.out.printf("%d  ",stackArray[top--]);
            }while(top>-1);
        }
        else
        System.out.println("Stack is Empty");
    }

}
public class Stack
{
    public static void main(String[] args)
    {
        StackOperation myStack = new StackOperation(10);

     myStack.push(10);
     myStack.push(11);
     myStack.push(12);
     myStack.pop();
     myStack.peek();

    }
}

