 class Node
{
    int data;
    Node next;  //variable name for link/reference
    //constructor
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
class LinkedList
{
    Node head;
    //Default constructor
    LinkedList()
    {
        this.head = null;
    }
   public void insertAtFront(int data)
    {
         Node newNode = new Node(data);
         if(head==null)
            this.head = newNode;
        else
        {
         newNode.next = this.head;
         this.head = newNode;
        }
        //displaying
         System.out.println("Nodes Structure after inserting -> "+data+" <- at front");
        displayNode();
    }
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        Node currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        //display
        System.out.println("Nodes Structure after inserting -> "+data+" <- at last");
        displayNode();
    }

    public void insertAtPosition(int data,int position)
    {
        Node newNode = new Node(data);
        Node currentNode = head;
        int currentPosition = 0;

        if(position == 1)
        {
            insertAtFront(data);
        }
        else
        {

           while(currentPosition<position-1)
          {
            currentNode = currentNode.next;
            currentPosition++;

          }
          newNode.next = currentNode.next;
          currentNode.next = newNode;
        }

         System.out.println("Nodes Structure after inserting -> "+data+" <- at Position: "+position);
        displayNode();
    }
   public void insertAfterNode(Node prevNode, int data) {
    if (prevNode == null) {
        System.out.println("Previous node cannot be null.");
        return;
    }
    Node newNode = new Node(data);
    newNode.next = prevNode.next;
    prevNode.next = newNode;
    
    System.out.println("Nodes Structure after inserting -> " + data );
    displayNode();
}
    public  void displayNode()
     {
        Node currentNode;
        currentNode = head;
        while(currentNode!= null)
        {
            System.out.println( currentNode.data);
            currentNode = currentNode.next;
        }
     }

     public void deleteFrontNode()
     {
       if(head.next==null)
         System.out.println("Empty Node");
       else
       head = head.next;
       System.out.println("Nodes Structure after deleting front node ");
       displayNode();
     }
     
    public void deleteLastNode()
    {
       if(head.next==null)
         System.out.println("Empty Node");
        else
        {
           Node currentNode = head;
           Node nextNode = head.next;
           while(nextNode.next!=null)
           {
           currentNode = currentNode.next;
           nextNode = currentNode.next;
           }
          currentNode.next = null;
         }
          System.out.println("Nodes Structure after deleting last node ");
          displayNode();
    }
    public void deleteAtPosition(int position)
    {
        int currentPosition = 1;
        Node currentNode = head;
        while (currentPosition<position-1)
        {
            currentNode = currentNode.next;
            currentPosition++;

        }
        currentNode.next = currentNode.next.next;
        System.out.println("Nodes Structure after deleting  node at position : "+position);
        displayNode();


    }
}
public class NodeLink
{
    public static void main(String[] args)
    {
        LinkedList myNode = new LinkedList();
        myNode.insertAtFront(10);
        myNode.insertAtFront(20);
        myNode.insertAtFront(30);
        myNode.insertAtLast(99);
       
        myNode.insertAtPosition(11,1);
        myNode.deleteLastNode();
        myNode.deleteAtPosition(3);
        } 
}