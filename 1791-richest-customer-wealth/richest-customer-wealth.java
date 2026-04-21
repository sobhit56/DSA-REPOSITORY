class Solution {
    public int maximumWealth(int[][] accounts) {
        int totalRow = accounts.length;
        int totalCol = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<totalRow; row++){
            int sum = 0;
            for(int col = 0; col<totalCol; col++){
                sum = sum+accounts[row][col];
            }
            max = Math.max(max,sum);
        }
        return max;
        
    }
}