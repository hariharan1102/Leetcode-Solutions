// Last updated: 8/12/2026, 9:01:55 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[i]=1;
        }
        int left=1;
        for(int i=0;i<nums.length;i++){
        b[i]*=left;
        left*=nums[i];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            b[i]*=right;
            right*=nums[i];
        }
        return b;
    }
}