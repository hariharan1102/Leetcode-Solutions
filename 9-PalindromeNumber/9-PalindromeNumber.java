// Last updated: 8/12/2026, 9:03:46 AM
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); 
        int n = s.length(); 

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
}