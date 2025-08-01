public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    int diff = heights[i + 1] - heights[i];
    sum += (diff > 0) ? 2 * diff : -diff;
  }
  return sum;
}