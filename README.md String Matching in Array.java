import java.util.*;

class Solution {

    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] words = new String[n];

        
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

     
        Solution sol = new Solution();
        List<String> result = sol.stringMatching(words);

        System.out.println("Matching substrings:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
