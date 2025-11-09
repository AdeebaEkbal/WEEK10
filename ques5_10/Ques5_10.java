package ques5_10;
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
        System.out.println();
    }
}
class C_plus_plus extends ObjectOriented
{
    void template()
    {
        System.out.println("template...");
    }
    void friendFunction()
    {
        System.out.println("friendFunction...");
    }
}
public class Ques5_10 
{
    public static void main(String[] args) 
    {
        JavaLanguage j1 = new JavaLanguage();
        j1.abstraction();
        j1.polymorphism();
        j1.inheritance();
        j1.persistence();
        j1.interfaces();
        
        C_plus_plus c1 = new C_plus_plus();
        c1.abstraction();
        c1.polymorphism();
        c1.inheritance();
        c1.template();
        c1.friendFunction();
    }
}
