// Last updated: 8/12/2026, 9:01:09 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='-'){
                continue;
            }
            sb.append(Character.toUpperCase(ch));
            if(sb.length()%(k+1)==k){
                sb.append('-');
            }
        }
        sb.reverse();
        if(sb.length()>0 && sb.charAt(0)=='-'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}