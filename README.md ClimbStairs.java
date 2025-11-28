public class ClimbStairs {

    // Function to calculate number of ways to climb n stairs
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;  // If 1 step → 1 way, if 2 steps → 2 ways
        }

        int a = 1; // ways(1)
        int b = 2; // ways(2)

        // Calculate ways for steps 3 to n
        for (int i = 3; i <= n; i++) {
            int c = a + b; // ways(i) = ways(i-1) + ways(i-2)
            a = b;         // move forward
            b = c;
        }

        return b; // final answer
    }

    // Main Function
    public static void main(String[] args) {

        int n = 5; // you can change this number for testing

        int result = climbStairs(n);

        System.out.println("Number of ways to climb " + n + " steps: " + result);
    }
}
