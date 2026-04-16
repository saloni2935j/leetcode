class Solution {
    public int numIdenticalPairs(int[] nums) {
      
        int N = nums.length;
        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
              if(nums[i] == nums[j] && i<j)
              count++;
            }
        }
            return count;
        }
    }
