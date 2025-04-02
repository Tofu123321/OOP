import java.util.Scanner;

public class Basic001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc số lượng test cases
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau số
        
        // Xử lý từng test case
        for (int i = 0; i < numberOfTestCases; i++) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
        
        scanner.close();
    }
}

//Nam ăn cứt
