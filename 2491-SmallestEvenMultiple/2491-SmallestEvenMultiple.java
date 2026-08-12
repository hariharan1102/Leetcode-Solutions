// Last updated: 8/12/2026, 9:00:00 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        return n*2;
    }
}