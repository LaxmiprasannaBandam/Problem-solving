
import java.util.Scanner;

class Solution {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;    // 0, 1, and negative numbers are not prime
        if (n == 2) return true;     // 2 is the only even prime number
        if (n % 2 == 0) return false; // Exclude all other even numbers

        // Check odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
        sc.close();
    }
}
