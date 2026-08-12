// Last updated: 8/12/2026, 9:02:24 AM
class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       return nums[n/2];
    }
}