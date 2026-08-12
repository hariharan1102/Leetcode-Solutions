// Last updated: 8/12/2026, 9:02:41 AM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res^=n;
        }
        return res;
    }
}