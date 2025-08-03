public int[] squareUp(int n) {
  int[] result = new int[n * n];
  for (int i = 1; i <= n; i++) {
    for (int j = 0; j < i; j++) {
      result[i * n - 1 - j] = j + 1;
    }
  }
  return result;
}
