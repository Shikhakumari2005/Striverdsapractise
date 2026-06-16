public class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindromes (e.g., "aba", center is 'b')
            int len1 = expandAroundCenter(s, i, i);
            
            // Case 2: Even length palindromes (e.g., "abba", center is between 'b' and 'b')
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Find the maximum length between the two cases
            int maxLen = Math.max(len1, len2);
            
            // Update indices if a longer palindrome is found
            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        
        // Extract and return the longest palindromic substring
        return s.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        // Expand outwards as long as characters match and indices are in bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the valid palindrome found
        return right - left - 1;
    }

    // Driver code to test the implementation
    public static void main(String[] args) {
        String input1 = "babad";
        System.out.println("Longest Palindrome in '" + input1 + "': " + longestPalindrome(input1)); // Output: "bab" or "aba"

        String input2 = "cbbd";
        System.out.println("Longest Palindrome in '" + input2 + "': " + longestPalindrome(input2)); // Output: "bb"
    }
}
