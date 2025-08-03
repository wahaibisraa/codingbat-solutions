public boolean arrayFront9(int[] nums) {
  int len = Math.min(nums.length, 4);
  for (int i = 0; i < len; i++) {
    if (nums[i] == 9) return true;
  }
  return false;
}