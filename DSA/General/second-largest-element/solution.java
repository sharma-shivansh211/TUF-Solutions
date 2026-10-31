class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            } 
            else if (num > second && num < largest) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}