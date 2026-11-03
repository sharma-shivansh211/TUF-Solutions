class Solution {
    public int[] reverseArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = nums.length - 1, j = 0 ; i >= 0 ; i--,j++)
            arr[j] = nums[i];
        return arr;
    }
}