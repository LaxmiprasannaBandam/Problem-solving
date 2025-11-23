import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);   
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();   

        Solution sol = new Solution();
        int[] divisors = sol.divisors(n);

        System.out.println("Divisors of " + n + ":");
        System.out.println(Arrays.toString(divisors));

        sc.close();
    }
}
