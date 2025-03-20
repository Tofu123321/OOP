
class Person
{
    String name;
    String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    @Override
    public String toString()
    {
        return name + "-" + address;
    }
}

class Student extends Person
{
    int credits;
    String studentID;
    public Student(String name, String address, String studentID)
    {
        super(name, address);
        this.credits = credits;
        this.studentID = studentID;
    }

    public void study()
    {
        credits++;
    }
    
    public int getCredits()
    {
        return credits;
    }
}

public class INHERITANCE003 
{
    public static void main(String[] args) 
    {
        Student student = new Student("Ollie",  "6381 Hollywood Blvd. Los Angeles 90028",  "123456");
        System.out.println(student.toString());
        System.out.println("Study credits " + student.getCredits());
        student.study();
        System.out.println("Study credits " + student.getCredits());   
    }
}
