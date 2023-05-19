import java.util.Scanner;

class PrimeFactorizer{
    
public static void main(String[] args){
    
Scanner sc = new Scanner(System.in);

long n = sc.nextLong();

System.out.print(n + ":");

 for (int i = 2;i<=n;i++) {

if (n % i == 0) {

n /= i;

if (n == 1) System.out.println(" " + i);

else System.out.print(" " + i);

i = 1;

}
}
}
}
