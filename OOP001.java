
class Dog
{
    private String name;
    private String breed;
    private int age;
    
    public Dog(String name, String breed, int age)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String setName()
    {
        return name;
    }

    public String SetBreed()
    {
        return breed;
    }

    public int setAge()
    {
        return age;
    }

    public void printDogDetail()
    {
        System.out.println("Name:" + name + "--Breed:" + breed + "--Age:" + age);
    }
}

class TET_HOLIDAY
{
    
}

public class OOP001 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Micky", "Husky", 12);
        dog.printDogDetail();
    }
}
