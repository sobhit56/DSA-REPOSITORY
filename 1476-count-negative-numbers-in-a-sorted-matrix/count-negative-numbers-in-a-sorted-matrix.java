class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int row =0; row<n; row++){
            for(int col = 0; col<m; col++){
                if(grid[row][col]<0) count++;
            }
        }
        return count;
    }
}