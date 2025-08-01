public boolean splitOdd10(int[] nums) {
  return helper(0, nums, 0, 0);
}

private boolean helper(int i, int[] nums, int sum1, int sum2) {
  if (i == nums.length) {
    return (sum1 % 10 == 0 && sum2 % 2 == 1);
  }
  return helper(i + 1, nums, sum1 + nums[i], sum2) ||
         helper(i + 1, nums, sum1, sum2 + nums[i]);
}