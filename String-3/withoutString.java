public String withoutString(String base, String remove) {
  String result = "";
  int i = 0;
  while (i < base.length()) {
    if (i + remove.length() <= base.length() &&
        base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
      i += remove.length();
    } else {
      result += base.charAt(i);
      i++;
    }
  }
  return result;
}
