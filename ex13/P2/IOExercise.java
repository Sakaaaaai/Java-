import java.io.*;

public class IOExercise {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number: ");
            String input = reader.readLine();
            double number = Double.parseDouble(input);

            double squareRoot = Math.sqrt(number);

            System.out.println("Square root of " + number + " is " + squareRoot);

            writeToFile(squareRoot);

            double fileContents = readFromFile();
            System.out.println("The value read from the file \"number.data\" is " + fileContents);

            if (squareRoot == fileContents) {
                System.out.println("s1 = s2");
            } else {
                System.out.println("s1 != s2");
            }

            double square = Math.pow(fileContents, 2);
            System.out.println("Square of " + fileContents + " is " + square);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void writeToFile(double squareRoot) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("number.data"));
        dos.writeDouble(squareRoot);
        dos.close();
        System.out.println("The square root value " + squareRoot + " is written to the file \"number.data\".");
    }

    private static double readFromFile() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("number.data"));
        double fileContents = dis.readDouble();
        dis.close();
        return fileContents;
    }
}
