public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        Solution sol = new Solution();

        System.out.println("ABCCED -> " + sol.exist(board, word1)); // true
        System.out.println("SEE -> " + sol.exist(board, word2));    // true
        System.out.println("ABCB -> " + sol.exist(board, word3));   // false
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        // Word fully matched
        if (i == word.length()) return true;

        // Out of bounds or character mismatch
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length
                || board[r][c] != word.charAt(i)) {
            return false;
        }

        // Mark this cell as visited
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore neighbors
        boolean found = dfs(board, word, r + 1, c, i + 1) ||
                        dfs(board, word, r - 1, c, i + 1) ||
                        dfs(board, word, r, c + 1, i + 1) ||
                        dfs(board, word, r, c - 1, i + 1);

        // Restore the cell
        board[r][c] = temp;

        return found;
    }
}
