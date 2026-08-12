// Last updated: 8/12/2026, 9:03:09 AM
class Solution {
    public int lengthOfLastWord(String s) {
      int end=s.length()-1;
      while(end>=0 && s.charAt(end)==' '){
        end--;
      }
      int start =end;
      while(start>=0 && s.charAt(start)!=' '){
        start--;
      }
      return end-start;
    }
}