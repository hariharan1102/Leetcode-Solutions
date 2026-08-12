// Last updated: 8/12/2026, 9:02:34 AM
class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out=out+str[i]+" ";
        }
        return out+str[0];
    }
}