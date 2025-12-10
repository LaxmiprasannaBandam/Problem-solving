import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // Function to find longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character is duplicate inside current window
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = lengthOfLongestSubstring(input);

        System.out.println("Length of longest substring without repeating characters: " + result);
        
        sc.close();
    }
}
