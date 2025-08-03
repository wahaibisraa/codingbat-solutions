public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  
  int i = start;
  int sum = 0;
  while (i < nums.length && nums[start] == nums[i]) {
    sum += nums[i];
    i++;
  }
  
  return groupSumClump(i, nums, target - sum) ||
         groupSumClump(i, nums, target);
}