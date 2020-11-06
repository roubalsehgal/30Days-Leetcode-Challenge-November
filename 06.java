// Wasn't able to solve this

class Solution {
    public int computeSum(int[] nums, int x) {
        int s = 0;
        for (int n : nums) {
            s += n / x + (n % x == 0 ? 0 : 1); 
        }
        return s;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        // binary search
        int left = 1;
        int right = nums[nums.length - 1];
        while (left <= right) {
            int pivot = left + ((right - left) >> 1);
            int num = computeSum(nums, pivot);

            if (num > threshold) {
                left = pivot + 1;    
            } else {
                right = pivot - 1;    
            }    
        }
        
        // at the end of loop, left > right,
        // computeSum(right) > threshold
        // computeSum(left) <= threshold
        // --> return left
        return left;
    }
}