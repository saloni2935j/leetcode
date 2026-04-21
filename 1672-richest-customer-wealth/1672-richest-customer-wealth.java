class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++ ){
            int sum = 0;

            for(int col = 0; col < accounts[0].length; col++){
            sum = sum + accounts[row][col];   
            }
        if(sum>maxWealth)
        maxWealth = sum;
    }
       return maxWealth;
    }
}