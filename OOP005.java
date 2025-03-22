import java.util.Objects;

class MyStuff 
{
    private String name;

    MyStuff(String name) 
    {
        this.name = name;
       // System.out.println("My Stuff is: " + name);
    }
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyStuff myStuff = (MyStuff) obj;
        return Objects.equals(name, myStuff.name);
    }
}
public class OOP005 
{
    public static void main(String[] args) 
    {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        if (m2.equals(m1))
            System.out.println("value compared: same");
        else
            System.out.println("value compared: different");

        // b. Viết thêm code vào dấu ...
        if (m2 == m1)
            System.out.println("reference compared: same");
        else
            System.out.println("reference compared: different");
    }
}

