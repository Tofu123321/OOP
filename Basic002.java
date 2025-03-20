import java.util.*;

public class Basic002{
    static final int MOD = 1000000007;
    
    public static int numMusicPlaylists(int n, int goal, int k) {
        // Mảng dp[i][j]: số cách tạo playlist độ dài i với j bài hát khác nhau
        long[][] dp = new long[goal + 1][n + 1];
        
        // Trường hợp cơ sở: playlist rỗng có 1 cách
        dp[0][0] = 1;
        
        // Điền bảng dp
        for (int i = 1; i <= goal; i++) {
            for (int j = 1; j <= Math.min(i, n); j++) {
                // Thêm một bài hát mới chưa dùng
                dp[i][j] = dp[i - 1][j - 1] * (n - (j - 1)) % MOD;
                
                // Nếu đã dùng đủ bài để có thể lặp lại (j > k)
                if (j > k) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j] * (j - k)) % MOD;
                }
            }
        }
        
        // Kết quả là số cách tạo playlist độ dài goal với n bài hát
        return (int) dp[goal][n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Số lượng test case
        
        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int goal = scanner.nextInt();
            System.out.println(numMusicPlaylists(n, goal, k));
        }
        
        scanner.close();
    }
}