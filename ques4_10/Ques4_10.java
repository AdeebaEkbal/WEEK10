package ques4_10;
class ObjectOriented
{
    void abstraction()
    {
        System.out.println("abstraction...");
    }
    void polymorphism()
    {
        System.out.println("polymorphism...");
    }
    void inheritance()
    {
        System.out.println("inheritance...");
    }
}
class JavaLanguage extends ObjectOriented
{
    void persistence()
    {
        System.out.println("persistence...");
    }
    void interfaces()
    {
        System.out.println("interfaces...");
    }
}
public class Ques4_10 
{
    public static void main(String[] args) 
    {
        JavaLanguage j1 = new JavaLanguage();
        j1.abstraction();
        j1.polymorphism();
        j1.inheritance();
        j1.persistence();
        j1.interfaces();
    }
}
