import java.util.*;

class Student
{
    private String name;
    private int age;
    private int numberOfStudent = 0;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display()
    {
        if(this.age >= 18)
        {
            System.out.println(this.name);
        }
    }
}
public class OOP011 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (scanner.hasNextLine()) 
        {
            String name = scanner.nextLine();
            if (!scanner.hasNextInt()) break;
            int age = Integer.parseInt(scanner.nextLine());
            students.add(new Student(name, age));
        }
     
        for(Student student : students)
        {
            student.display();
        }
        System.out.println(students.size());
        scanner.close();
    }
}
