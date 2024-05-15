#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // Create a hash table to store the indices of numbers
        unordered_map<int, int> num_indices;
        
        // Iterate through the array
        for (int i = 0; i < nums.size(); ++i) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            
            // Check if the complement exists in the hash table
            if (num_indices.find(complement) != num_indices.end()) {
                // If found, return the indices of the two numbers
                return {num_indices[complement], i};
            }
            
            // If not found, add the current number to the hash table
            num_indices[nums[i]] = i;
        }
        
        // Return an empty vector if no solution is found
        return {};
    }
};

