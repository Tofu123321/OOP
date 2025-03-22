import java.util.*;

class FlightBooking 
{
    public String flightId = "OOP24";
    private static int seatAvailable = 180;
    private static Set<Integer> bookedUser = new HashSet<>();

    public static void Booking(int userId)
    {
        if(seatAvailable > 0)
        {
            seatAvailable--;
            bookedUser.add(userId);
            System.out.print("[Seat Available: " + seatAvailable + "]");
        }
    }
    

    public static void Comfirmed(int userID)
    {
        System.out.print("--User " + userID + " Confirmed--");
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public static void Cancel(int userId)
    {
        seatAvailable++;
        bookedUser.remove(userId);
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public static void resetSeat()
    {
        seatAvailable = 180;
    }
}

public class OOP003
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
       // FlightBooking flightBooking;
        while (testCases-- > 0) 
        {
           String[] input = scanner.nextLine().split(" ");
           for(int i = 0; i < input.length ; i += 2)
           {
                int userId = Integer.parseInt(input[i]);
                if(input[i+1].equals("Booking"))
                {
                    FlightBooking.Booking(userId);
                }
                else if(input[i+1].equals("Confirmed"))
                {
                    FlightBooking.Comfirmed(userId);
                }
                else if(input[i+1].equals("Cancel"))
                {
                    FlightBooking.Cancel(userId);
                }
           }
           System.out.println();
           FlightBooking.resetSeat();
        }
        scanner.close();
    }
}
