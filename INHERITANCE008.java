
class Person
{
    protected String name;
    protected String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return name + " - " + address;
    }
}

class Student extends Person
{
    protected int credits;

    public Student(String name, String address, int credits)
    {
        super(name, address);
        this.credits = credits;
    }

    public void Study(String name)
    {
        credits++;
    }

    public void getCredits()
    {
        System.out.println("Study credits " + credits);
    }
}

public class INHERITANCE008 
{
    public static void main(String[] args) 
    {
        Student st = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028",0);
        System.out.println(st.toString());
        st.getCredits();
        st.Study("Ollie");
        st.getCredits();
    }
}
