// Last updated: 8/12/2026, 9:01:51 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int num : nums){
            if(num != 0){
                nums[k++] = num;
            }
        }
        while(k < nums.length){
            nums[k++] = 0;
        }
    }
}