class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            // Difference with elements on the left
            int left = x * i - leftSum;

            // Difference with elements on the right
            int right = (totalSum - leftSum - x)
                      - x * (n - i - 1);

            result[i] = left + right;

            leftSum += x;
        }

        return result;
    }
}