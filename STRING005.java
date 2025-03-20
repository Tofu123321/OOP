import java.util.Scanner;

public class STRING005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim()); // Số lượng test cases
        
        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine().trim();
            System.out.println(findLongestWord(sentence));
        }
        scanner.close();
    }
    
    public static String findLongestWord(String sentence) {
        if (sentence.isEmpty()) return "";
        
        String[] words = sentence.split("\\s+"); // Tách từ bằng khoảng trắng
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
}