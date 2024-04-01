public class Queue
{ 
    int[] num = new int[10];
    int maxSize;
    int front = 0;
    int rear = -1;
    int[] arrayQueue;

    public Queue(int maxSize)
    {
      this.maxSize = maxSize;
      this.arrayQueue = new int[maxSize];
    }

    public boolean isFull()
    {
        return rear>=maxSize-1;
    }
    public boolean isEmpty()
    {
        return rear<front;
    }
    public void enQueue(int element)
    {
        if(!isFull())
          arrayQueue[++rear] = element;
        else
          System.out.println("Queue is FUll");
    }
    public void deQueue()
    {
        if(!isEmpty())
          {
            int element = arrayQueue[front++];
            System.out.println("Deleted Item : "+element);
          }
        else
          System.out.println("Queue is Empty");
    }
    public void printQueue()
    {
        if(!isEmpty())
        {
            System.out.println("Element of Queue are : ");
            for(int i=front;i<=rear;i++)
             System.out.println(arrayQueue[i]);
        }
        else
          System.out.println("Queue is Empty");
    }

    public static void main(String[] args)
    {
         Queue one = new Queue(5);
         one.enQueue(1);
         one.enQueue(2);
         one.enQueue(3);
         one.enQueue(4);
         one.enQueue(5);
         one.enQueue(6);
         one.printQueue();
         one.deQueue();
         one.printQueue();
         one.deQueue();
         one.printQueue();
    }

}