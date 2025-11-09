package ques3_10;
public class Ques3_10 
{
    public static void minMaxAdd(int n1,int n2)
    {
        int max = Math.max(n2, n1);
        int min = Math.min(n2, n1);
        int add=n1+n2;
        System.out.println("Maximum of the given integers:" +max);
        System.out.println("Minimum of the given integers:" +min);
        System.out.println("Addition of the given integers:" +add);
    }
    public static void minMaxAdd(double n1,double n2)
    {
        double max = Math.max(n2, n1);
        double min = Math.min(n2, n1);
        double add=n1+n2;
        System.out.println("Maximum of the given real numbers:" +max);
        System.out.println("Minimum of the given real numbers:" +min);
        System.out.println("Addition of the given real numbers:" +add);
    }
    
    public static void minMaxAdd(char n1,char n2)
    {
        char max = (char) Math.max(n2, n1);
        char min = (char) Math.min(n2, n1);
        String add=""+n1+n2;        //
        System.out.println("Maximum of the given characters:" +max);
        System.out.println("Minimum of the given characters:" +min);
        System.out.println("Addition of the given characters:" +add);
    }
    
    public static void main(String[] args) 
    {
        minMaxAdd(200,300);
        minMaxAdd(200.5,300.5);
        minMaxAdd('a','b');     //
    }
}
