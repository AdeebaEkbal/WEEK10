package question2_10;
class Edible
{
    static class Fruit
    {
        static void fruitDetails()
        {
            System.out.println("Fruits...");
        }
        void fruitPackaging()
        {
            System.out.println("Fruits have been packed");
        }
    }
    
    static class Vegetable
    {
        static void vegetableDetails()
        {
            System.out.println("Vegetables...");
        }
        
        void vegetablePackaging()
        {
            System.out.println("Vegetables have been packed");
        }
    }
}
public class Question2_10 
{
    public static void main(String[] args) 
    {
        Edible.Fruit.fruitDetails();    //static
        Edible.Vegetable.vegetableDetails();    //static
        
        Edible.Fruit f1=new Edible.Fruit();
        f1.fruitPackaging();
        Edible.Vegetable v1=new Edible.Vegetable();
        v1.vegetablePackaging();
    }
}
