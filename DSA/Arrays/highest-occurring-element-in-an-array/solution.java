import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mostFrequent = nums[0];
        for (int num : nums) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency ||
                (frequency == maxFrequency && num < mostFrequent)) {
                maxFrequency = frequency;
                mostFrequent = num;
            }
        }
        return mostFrequent;
    }
}