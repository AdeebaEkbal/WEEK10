package ques8_10;
class Shape
{
    void area(int side)
    {
        int area=side*side;
        System.out.println("Area of square:" +area);
    }
    void area(int length, int breadth)
    {
        int area=length*breadth;
        System.out.println("Area of rectangle:" +area);
    }
    void area(double radius)
    {
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle:" +area);
    }
}
public class Ques8_10 
{
    public static void main(String[] args) 
    {
        Shape square=new Shape();
        square.area(2);
        
        Shape rectangle=new Shape();
        rectangle.area(2, 3);
        
        Shape circle=new Shape();
        circle.area(2.5);
    }
}
