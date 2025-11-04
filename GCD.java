import java.util.Scanner;

public class GCDRecursion {
    
    // Recursive function to find GCD
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;   // base case
        else
            return gcd(b, a % b);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);

        System.out.println("GCD or HCF of " + num1 + " and " + num2 + " is " + result);

        sc.close();
    }
}
