class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int t = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if( nums[i] == 0 )
                t = 0;
            else{
                t++;
                max = Math.max(max,t);
            }
        }
        return max;
    }
}