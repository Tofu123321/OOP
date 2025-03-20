
class SimpleDate
{
    String day;
    String month;
    String year;

    public SimpleDate(String day, String month, String year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SimpleDate that = (SimpleDate) obj;
        return day.equals(that.day) && month.equals(that.month) && year.equals(that.year);
    }
}

public class OBJECT_REFERENCES004 
{
    public static void main(String[] args)
    {
        SimpleDate date1 = new SimpleDate("1", "2", "2000");
        SimpleDate date2 = new SimpleDate("heh", "2", "2012");
        SimpleDate date3 = new SimpleDate("5", "2", "2012");
        SimpleDate date4 = new SimpleDate("1", "2", "2000");
        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date3));
        System.out.println(date1.equals(date4));
    }
}
