import java.util.*;

public class MaxEqualFreq {

    public static int maxEqualFreq(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int oldFreq = countMap.getOrDefault(num, 0);
            if (oldFreq > 0) {
                freqMap.put(oldFreq, freqMap.get(oldFreq) - 1);
                if (freqMap.get(oldFreq) == 0) {
                    freqMap.remove(oldFreq);
                }
            }

            // update new frequency
            int newFreq = oldFreq + 1;
            countMap.put(num, newFreq);
            freqMap.put(newFreq, freqMap.getOrDefault(newFreq, 0) + 1);

            maxFreq = Math.max(maxFreq, newFreq);

            int len = i + 1;

            // Case 1: all freq = 1
            if (maxFreq == 1) {
                result = len;
            }
            // Case 2: one number with freq = 1
            else if (freqMap.get(1) != null &&
                    freqMap.get(1) == 1 &&
                    freqMap.get(maxFreq) * maxFreq + 1 == len) {
                result = len;
            }
            // Case 3: one number has extra frequency
            else if (freqMap.get(maxFreq) == 1 &&
                    freqMap.get(maxFreq - 1) != null &&
                    freqMap.get(maxFreq - 1) * (maxFreq - 1) + maxFreq == len) {
                result = len;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,5,3,3,5};
        System.out.println(maxEqualFreq(nums)); // Output: 7
    }
}