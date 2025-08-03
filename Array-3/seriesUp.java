public int[] seriesUp(int n) {
  int[] result = new int[n * (n + 1) / 2];
  int idx = 0;
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      result[idx++] = j;
    }
  }
  return result;
}
