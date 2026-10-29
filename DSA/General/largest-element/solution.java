class Solution {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0, j = nums.length -1 ; i <= j ; i++,j--)
            largest = Math.max(largest, Math.max(nums[i], nums[j]));
        return largest;
    }
}