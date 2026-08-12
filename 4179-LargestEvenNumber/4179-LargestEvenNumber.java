// Last updated: 8/12/2026, 9:00:03 AM
class Solution {
    public String largestEven(String s) {
        int i;
        for(i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '2') break;
        }
        return s.substring(0, i + 1);
    }
}