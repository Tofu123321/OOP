import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount other) throws Exception {
        if (!this.currency.equals(other.currency)) {
            throw new Exception("Currency doesn't match");
        }
        this.amount += other.amount;
    }

    @Override
    public String toString() {
        return amount + ""; // Chỉ in số tiền
    }
}

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua dòng thừa

        for (int i = 0; i < n; i++) {
            try {
                // Đọc dữ liệu vào
                String[] input1 = scanner.nextLine().split(" ");
                String currency1 = input1[0];
                int amount1 = Integer.parseInt(input1[1]);
                Amount amt1 = new Amount(currency1, amount1);
                
                String[] input2 = scanner.nextLine().split(" ");
                String currency2 = input2[0];
                int amount2 = Integer.parseInt(input2[1]);
                Amount amt2 = new Amount(currency2, amount2);
                
                // Thực hiện phép cộng
                amt1.add(amt2);
                System.out.println(amt1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
