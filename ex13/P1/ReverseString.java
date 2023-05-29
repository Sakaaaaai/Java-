import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReverseString {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            int[] inputData = readInputData(inputFile);
            writeOutputData(inputData, outputFile);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    private static int[] readInputData(String inputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        StringBuilder sb = new StringBuilder();

        int data;
        while ((data = fis.read()) != -1) {
            sb.append((char) data);
        }

        fis.close();

        String inputString = sb.toString();
        int[] inputData = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            inputData[i] = inputString.charAt(i);
        }

        return inputData;
    }

    private static void writeOutputData(int[] inputData, String outputFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputFile);

        for (int i = inputData.length - 1; i >= 0; i--) {
            fos.write(inputData[i]);
        }

        fos.close();
    }
}
