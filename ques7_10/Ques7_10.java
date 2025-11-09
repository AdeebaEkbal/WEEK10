package ques7_10;
class Employee
{
    String empName;
    int empId;
    
    class Salary
    {
        int basic;
        int hra;
        
        void displaySalary()
        {
            System.out.println("basic:" +basic);
            System.out.println("hra:" +hra);
        }
    }
    class JoiningDate
    {
        int day;
        String month;
        int year;
        
        void displayJoiningDate()
        {
            System.out.println("day:" +day);
            System.out.println("month:" +month);
            System.out.println("year:" +year);
        }
    }
    
    void displayEmployee()
    {
        System.out.println("empName:" +empName);
        System.out.println("empId:" +empId);
        
        Salary s1=new Salary();
        s1.basic=10000;
        s1.hra=2000;
        s1.displaySalary();
        
        JoiningDate j1=new JoiningDate();
        j1.day=21;
        j1.month="Jan";
        j1.year=2024;
        j1.displayJoiningDate();
    }
    
}
public class Ques7_10 
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.empName="Iqra";
        e1.empId=101;
        e1.displayEmployee();
    }
}
