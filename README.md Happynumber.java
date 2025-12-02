import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;  // You can change the number here
        boolean result = isHappy(n);

        System.out.println("Is " + n + " a happy number? " + result);
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // we found a loop → not happy
            }

            seen.add(n);
            n = getNext(n);
        }

        return true; // reached 1 → happy number
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;      // last digit
            sum += digit * digit;    // square and add
            n /= 10;                 // remove last digit
        }
        return sum;
    }
}
