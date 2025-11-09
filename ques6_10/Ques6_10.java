package ques6_10;
class University
{
    String name;
    int ranking;
    
    University(String name,int ranking)
    {
        this.name=name;
        this.ranking=ranking;
    }
    int getter()
    {
        return ranking;
    }
}
class Faculty extends University
{
    String name;
    
    Faculty(String name,int ranking,String facultyname)
    {
        super(name,ranking);
        this.name=facultyname;
    }
    
    void Details()
    {
        System.out.println("Name of University:" +super.name);
        System.out.println("Ranking of University:" +super.ranking);
        System.out.println("Name of faculty:" +name);
    }
}
class Department extends Faculty
{
    String name;
    String chairman;
    
    Department(String name,int ranking,String facultyname,String deptname,String chairman)
    {
        super(name,ranking,facultyname);
        this.name=deptname;
        this.chairman=chairman;
    }
    @Override
    void Details()
    {
        System.out.println("Name of Department:" +name);
        System.out.println("Name of chairman:" +chairman);
    }
    void Display()
    {
        super.Details();
        this.Details();
    }
}
public class Ques6_10 
{
    public static void main(String[] args) 
    {
        Department d1 = new Department("AMU",3,"Faculty of Science","CS","ARF");
        d1.Display();
    }
}
