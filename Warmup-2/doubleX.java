boolean doubleX(String str) {
  int i = str.indexOf("x");
  return (i != -1 && i < str.length() - 1 && str.charAt(i + 1) == 'x');
}
