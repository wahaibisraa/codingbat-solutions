public int[] copyEvens(int[] nums, int count) {
  int[] result = new int[count];
  int j = 0;
  for (int num : nums) {
    if (num % 2 == 0) {
      result[j++] = num;
      if (j == count) break;
    }
  }
  return result;
}