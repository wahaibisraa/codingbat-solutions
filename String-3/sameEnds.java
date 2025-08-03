public String sameEnds(String string) {
  String result = "";
  int len = string.length();
  for (int i = 0; i < len / 2; i++) {
    if (string.substring(0, i + 1).equals(string.substring(len - i - 1))) {
      result = string.substring(0, i + 1);
    }
  }
  return result;
}
