import java.util.Scanner;
public class Ring {
String String_Sum;
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String S1 = sc.nextLine();
String S2 = sc.nextLine();
String Sum = S1+S1;
int n = Sum.indexOf(S2);
if(n == -1){System.out.println("No");}
else {System.out.println("Yes");}
}
}
