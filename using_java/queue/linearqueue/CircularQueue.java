public class CircularQueue
{ 
    int maxSize;
    int front = -1;
    int rear = -1;
    int[] arrayQueue;

    public CircularQueue(int maxSize)
    {
      this.maxSize = maxSize;
      this.arrayQueue = new int[maxSize];
    }

    public boolean isFull()
    {
        return front==(rear+1)%maxSize;
    }
    public boolean isEmpty()
    {
        return froont==-1;     // Alternative rear == -1 ;
    }
    public void enQueue(int element)
    {
        if(!isFull())
        {
            rear = (rear+1)%(maxSize);
            arrayQueue[rear] = element;
            size++;
          }
        else
        System.out.println("Queue is Full cannot add new elements");
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
            for(int i=0;i<=maxSize-1;i++)
             System.out.println(arrayQueue[i]);
        }
        else
          System.out.println("Queue is Empty");
    }

    public static void main(String[] args)
    {
         CircularQueue one = new CircularQueue(5);
         one.enQueue(1);
         one.enQueue(2);
         one.enQueue(3);
         one.enQueue(4);
         one.enQueue(5);
        one.printQueue();
        one.enQueue(6);
        one.printQueue();
        one.deQueue();
        
    }

}