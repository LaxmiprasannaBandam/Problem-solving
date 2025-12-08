import java.util.Scanner;

public class SquareTriples {

    public static int countTriples(int n) {
        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c2 = a * a + b * b;
                int c = (int) Math.sqrt(c2);
                if (c * c == c2 && c <= n) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int result = countTriples(n);
        System.out.println("Number of square triples for n = " + n + ": " + result);

        scanner.close();
    }
}
