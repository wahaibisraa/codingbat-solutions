 public String doubleChar(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      result.append(str.charAt(i)).append(str.charAt(i));
    }
    return result.toString();
  }