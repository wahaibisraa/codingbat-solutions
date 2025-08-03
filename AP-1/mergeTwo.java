public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] result = new String[n];
  int i = 0, j = 0, k = 0;
  while (k < n) {
    int cmp = a[i].compareTo(b[j]);
    if (cmp < 0) result[k++] = a[i++];
    else if (cmp > 0) result[k++] = b[j++];
    else {
      result[k++] = a[i];
      i++;
      j++;
    }
  }
  return result;
}
