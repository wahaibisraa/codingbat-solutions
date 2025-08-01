public boolean splitArray(int[] nums) {
  return splitHelper(0, nums, 0, 0);
}

private boolean splitHelper(int i, int[] nums, int sum1, int sum2) {
  if (i == nums.length) return sum1 == sum2;
  return splitHelper(i + 1, nums, sum1 + nums[i], sum2) ||
         splitHelper(i + 1, nums, sum1, sum2 + nums[i]);
}