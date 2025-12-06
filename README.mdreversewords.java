import java.util.Scanner;

public class Main {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); 
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();  

        String result = reverseWords(input);

        System.out.println("Reversed words:");
        System.out.println(result);

        sc.close();
    }
}
