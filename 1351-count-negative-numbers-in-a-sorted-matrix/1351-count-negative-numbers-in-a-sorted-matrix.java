class Solution {
    public int countNegatives(int[][] grid) {
        int totalRow = grid.length;
        int totalCol = grid[0].length;
        int count = 0;

        for(int row = 0; row<totalRow; row++){
                  for(int col = 0; col<totalCol; col++){
                    if(grid[row][col] < 0)
                    count++;
                  }
        }
          return count;
    }
}