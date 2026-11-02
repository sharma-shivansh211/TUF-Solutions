class Solution {
    public void rotateArray(int[] nums, int k) {
        int[] arr = nums.clone();
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[(i+k)%nums.length];
        }
    }
}