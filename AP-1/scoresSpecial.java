public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a) + largestSpecial(b);
}

private int largestSpecial(int[] nums) {
  int max = 0;
  for (int n : nums) {
    if (n % 10 == 0 && n > max) max = n;
  }
  return max;
}