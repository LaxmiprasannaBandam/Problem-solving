public class Main {

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String a = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < a.length(); i++) {
            if (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) {
                count++;
            } else {
                result.append(count);
                result.append(a.charAt(i));
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int n = 5;  // You can change n to test other values
        String output = countAndSay(n);
        System.out.println("Count and Say of " + n + ": " + output);
    }
}
