import java.util.Scanner;

public class Basic006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng test case
        int testCases = Integer.parseInt(scanner.nextLine());

        // Xử lý từng dòng đầu vào
        for (int i = 0; i < testCases; i++) {
            String input = scanner.nextLine();
            int digitCount = 0;

            // Duyệt từng ký tự để kiểm tra chữ số
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            // In kết quả cho dòng hiện tại
            System.out.println(digitCount);
        }

        scanner.close();
    }
}
