import java.util.*;

class Employee
{
    String name;
    double salary;
    String department;
    String email;
    int age;

    public Employee(String name, double salary, String department, String email, int age)
    {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return String.format("%s %.2f %s %d", name, salary, email, age);
    }
}



public class COLLECTION007 
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<> ();
        Map<String, List<Employee>> departments = new HashMap<> ();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- >0)
        {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            double salary = Double.parseDouble(parts[1]);
            String department = parts[2];
            String email = "n/a";
            int age = -1;
            if(parts.length > 3)
            {
                if(parts[3].matches("\\d+"))
                {
                    age = Integer.parseInt(parts[3]);
                }
                else
                {
                    email = parts[3];
                    if(parts.length > 4)
                    {
                        age = Integer.parseInt(parts[4]);
                    }
                }
            }
            Employee employee = new Employee(name, salary, department, email, age);
            employees.add(employee);
            departments.putIfAbsent(department, new ArrayList<> ());
            departments.get(department).add(employee);
        }
        String highestAvgDept = Collections.max(departments.entrySet(), 
            Comparator.comparingDouble(e -> e.getValue().stream().mapToDouble(emp -> emp.salary).average().orElse(0.0)))
            .getKey();

        System.out.println("Highest Average Salary: " + highestAvgDept);
        departments.get(highestAvgDept).forEach(System.out::println);
    }
}
