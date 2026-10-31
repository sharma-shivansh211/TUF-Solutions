class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = largestElement(nums);
        int Second = Integer.MIN_VALUE;
        int l = 0;
        int r = nums.length-1;
        while(l < nums.length ){
            if(nums[l] != largest && Second < nums[l]) Second = nums[l];
            l++;
        }
        if(Second == Integer.MIN_VALUE) return -1;
        return Second;
    }
    static int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0, j = nums.length -1 ; i <= j ; i++,j--)
            largest = Math.max(largest, Math.max(nums[i], nums[j]));
        return largest;
    }
}