public int[] copyEndy(int[] nums, int count) {
  int[] result = new int[count];
  int j = 0;
  for (int num : nums) {
    if (isEndy(num)) {
      result[j++] = num;
      if (j == count) break;
    }
  }
  return result;
}

private boolean isEndy(int n) {
  return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}