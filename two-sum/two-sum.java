import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of numbers
        HashMap<Integer, Integer> numIndices = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (numIndices.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }
            
            // If not found, add the current number to the HashMap
            numIndices.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
