import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();         // reads single word input
        String a = "";                // will store the reversed string
        
        for (int i = s.length() - 1; i >= 0; i--) {  // loop backward
            a += s.charAt(i);         // append each character from the end
        }
        
        if (a.equals(s)) {            // compare content using equals()
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
