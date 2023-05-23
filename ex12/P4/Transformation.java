import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < q; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            
            if (parts[0].equals("print")) {
                int a = Integer.parseInt(parts[1]);
                int b = Integer.parseInt(parts[2]);
                System.out.println(str.substring(a, b + 1));
            } else if (parts[0].equals("reverse")) {
                int a = Integer.parseInt(parts[1]);
                int b = Integer.parseInt(parts[2]);
                String reversed = reverseSubstring(str, a, b);
                str = str.substring(0, a) + reversed + str.substring(b + 1);
            } else if (parts[0].equals("replace")) {
                int a = Integer.parseInt(parts[1]);
                int b = Integer.parseInt(parts[2]);
                String p = parts[3];
                str = str.substring(0, a) + p + str.substring(b + 1);
            }
        }
        
        scanner.close();
    }
    
    private static String reverseSubstring(String str, int a, int b) {
        StringBuilder sb = new StringBuilder(str.substring(a, b + 1));
        return sb.reverse().toString();
    }
}
