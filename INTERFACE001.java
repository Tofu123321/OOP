
interface Packable
{
    double weight();
}

class Book
{
    String author;
    String name;
    double weight;
    public Book(String author, String name, double weight)
    {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public void Packable()
    {
        System.out.println(author + ": " + name);
    }
}

class CD
{
    String artis;
    String name;
    int publicationYear;
    public CD(String artis, String name, int publicationYear)
    {
        this.artis = artis;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public void Packable()
    {
        System.out.println(artis + ": " + name + " (" + publicationYear + ")");
    }
}

public class INTERFACE001 
{
    public static void main(String[] args) 
    {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        book1.Packable();
        book2.Packable();
        book3.Packable();
        cd1.Packable();
        cd2.Packable();
        cd3.Packable();
    }
}
