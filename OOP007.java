import java.util.*;

class Acount {
    int id;
    String name;
    Map<Integer, String> Note;

    public Acount(int id, String name) {
        this.id = id;
        this.name = name;
        this.Note = new TreeMap<>(); // Khởi tạo đúng cách
    }

    public void AddNote(String s) {
        Note.put(Note.size() + 1, s);
    }

    public void Share(Acount acount, int i) {
        if (Note.containsKey(i)) {
            String note = Note.get(i);
            acount.AddNote(note);
        }
    }
}

public class OOP007 {
    public static String returnNote(String input) {
        try {
            String date = input.substring(11, 13);
            String month = input.substring(8, 11);
            String year = input.substring(13, 15);
            String n = input.substring(16);
            return date + " " + month + " " + year + " | " + n;
        } catch (Exception e) {
            return "invalid input";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int id = 0;
        Map<Integer, Acount> acounts = new HashMap<>();

        // Khởi tạo tài khoản
        while (t-- > 0) {
            String name = scanner.nextLine();
            id++;
            acounts.put(id, new Acount(id, name));
        }

        // Xử lý lệnh
        while (scanner.hasNextLine()) {
            String Data = scanner.nextLine();
            String[] data = Data.split(" ");
            if (data.length < 2) continue;

            int Id = Integer.parseInt(data[0]);
            Acount acount = acounts.get(Id);

            if (data[1].equals("Add") && data.length >= 3) {
                String Note = returnNote(Data);
                if (!Note.equals("invalid input") && acount != null) {
                    acount.AddNote(Note);
                }
            } else if (data[1].equals("Share") && data.length >= 4) {
                Acount acount2 = acounts.get(Integer.parseInt(data[2]));
                int noteId = Integer.parseInt(data[3]);
                if (acount != null && acount2 != null) {
                    acount.Share(acount2, noteId);
                }
            }
        }

        // In kết quả
        for (Acount acount : acounts.values()) {
            System.out.println("Account: " + acount.name);
            for (Map.Entry<Integer, String> entry : acount.Note.entrySet()) {
                System.out.println(entry.getValue());
            }
        }

        scanner.close();
    }
}
