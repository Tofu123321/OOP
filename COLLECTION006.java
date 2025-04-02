import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COLLECTION006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số lượng test case
        int T = sc.nextInt();  
        sc.nextLine();  // Đọc bỏ dòng dư

        // Duyệt qua từng test case
        for (int t = 0; t < T; t++) {
            Map<Integer, Integer> valueCount = new HashMap<>();
            String input = sc.nextLine(); // Đọc dòng chứa các cặp khóa-giá trị
            String[] pairs = input.split(" "); // Tách các cặp khóa-giá trị theo khoảng trắng
            
            // Duyệt qua các cặp khóa-giá trị và đếm số lần xuất hiện của các giá trị
            for (int i = 1; i < pairs.length; i += 2) {
                int value = Integer.parseInt(pairs[i]); // Chuyển giá trị thành kiểu int
                valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
            }
            
            // Tìm giá trị xuất hiện ít nhất và nhỏ nhất
            int minCount = Integer.MAX_VALUE;
            int result = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : valueCount.entrySet()) {
                int value = entry.getKey();
                int count = entry.getValue();
                
                // Nếu tìm thấy giá trị có số lần xuất hiện ít hơn hoặc giá trị nhỏ hơn
                if (count < minCount || (count == minCount && value < result)) {
                    minCount = count;
                    result = value;
                }
            }
            
            // In kết quả cho test case hiện tại
            System.out.println(result);
        }

        sc.close();
    }
}
