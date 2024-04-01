public class Rectangle      //Class Rectangle  
{
    int area;//declaring an instance variable for area
    public Rectangle(int length,int breadth) //Double parameterized Constructor for Class Rectangle
    {
        this.area = length*breadth;
    }
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(4,6);  //creating an object rect1 from Class Rectangle
        System.out.println("Area : "+rect1.area); //Displaying area of the rectangle
    }
}