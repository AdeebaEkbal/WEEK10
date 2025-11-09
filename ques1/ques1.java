package ques1;
class Person
{
    String name;
    int phone;
    
    
    
    
    class Address
    {
        int House_No;
        String Street;
        String City;    
        String State;
        
        void displayAddr()
        {
            System.out.println("House_No:" +House_No);
            System.out.println("Street:" +Street);
            System.out.println("City:" +City);
            System.out.println("State:" +State);
            
        }
    }
    
    class DateOfBirth
    {
        int Date;
        String Month;
        int Year;
        
        void displayDOB()
        {
            System.out.println("Date:" +Date);
            System.out.println("Month:" +Month);
            System.out.println("Year:" +Year);
            
        }
    }
    
    void Display()
    {
        Address a1 =new Address();
        a1.House_No=1;
        a1.Street="Street 1";
        a1.City="Aligarh";
        a1.State="UP";
        a1.displayAddr();
        
        DateOfBirth d1=new DateOfBirth();
        d1.Date=29;
        d1.Month="March";
        d1.Year=2007;
        d1.displayDOB();
    }
}
public class ques1 
{
    public static void main(String[] args) 
    {
        Person p1=new Person();
        p1.name="Iqra";
        p1.phone=1002003001;
        p1.Display();
    }
}
