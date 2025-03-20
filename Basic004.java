import java.util.*;

public class Basic004 {
    // Hàm kiểm tra xem có thể chia mảng thành <= k đoạn với tổng không vượt quá mid
    private static boolean canSplit(int[] nums, int k, int mid) {
        int sum = 0, count = 1;
        for (int num : nums) {
            if (sum + num > mid) {
                count++;
                sum = num;
                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;
    }

    public static int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;  // Thử giảm mid
            } else {
                left = mid + 1; // Tăng mid nếu không thể chia
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống

        for (int i = 0; i < testCases; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int[] nums = Arrays.stream(parts[0].split(","))
                               .mapToInt(Integer::parseInt)
                               .toArray();
            int k = Integer.parseInt(parts[1]);

            System.out.println(splitArray(nums, k));
        }

        scanner.close();
    }
}
