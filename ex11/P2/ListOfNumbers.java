import java.io.*;

public class ListOfNumbers {
    private static final int SIZE = 10;
    private int[] vector;

    public ListOfNumbers() {
        vector = new int[SIZE];
        for (int i = 0; i < SIZE; i++)
            vector[i] = i;
    }

    public void writeList() {
        int count=0;
        try {
            System.out.println("Entering try block.");
            for (int i = 0; i <= SIZE; i++){
                System.out.println("Value at: " + i + " = " + vector[i]);
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entering catch block.");
        } finally {
        System.out.println("Caught ArrayIndexOutOfBoundsException: "+count);
        System.out.println("finally block.");
        }
    }

    public static void main(String[] args) {
        ListOfNumbers l = new ListOfNumbers();
        l.writeList();
    }
}
