package ques9_10;
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running...");
    }
}
class Bike extends Vehicle
{
    @Override
    void run()
    {
        System.out.println("Bike is running...");
        
    }
}
class Car extends Vehicle
{
    @Override
    void run()
    {
        System.out.println("Car is running...");
        
    }
}
public class Ques9_10 
{
    public static void main(String[] args) 
    {
        Bike b1=new Bike();
        Car c1=new Car();
        
        Vehicle v1=b1;
        Vehicle v2=c1;
        
        v1.run();
        v2.run();
    }
}
