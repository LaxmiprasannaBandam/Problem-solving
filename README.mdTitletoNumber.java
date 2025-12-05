import java.util.Scanner;

public class ExcelColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Excel column title: ");
        String columnTitle = sc.nextLine().toUpperCase();  // convert to uppercase just in case

        int columnNumber = titleToNumber(columnTitle);

        System.out.println("Column number: " + columnNumber);

        sc.close();
    }
}
