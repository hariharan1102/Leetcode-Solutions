// Last updated: 8/12/2026, 9:00:31 AM
class Solution {
     public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0; 
        int col = grid[0].length-1;
        int count = 0;
        while(row < rows && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            } else {
                count += rows-row;
                col--;
            }
        }
        return count;
    }
}