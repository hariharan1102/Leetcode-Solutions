// Last updated: 8/12/2026, 9:00:22 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int i =0; int n = mat.length;int j=n-1; int sum = 0;
        while(n>0){
            sum+=mat[i][i] + mat[i][j];
            i++;j--;n--;
        }
        int sub = (mat.length/2); n = mat.length;
        if(n%2==0) return sum;
        else return sum-mat[sub][sub];
    }
}