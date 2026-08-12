// Last updated: 8/12/2026, 9:01:27 AM
class Solution {
    public int thirdMax(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
           if(nums[i]!=nums[i-1]) count++;
           if(count==2) return nums[i-1];
        }
        return nums[nums.length-1];
    }
}