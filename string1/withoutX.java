public String withoutX(String str) {
  int len = str.length();

    if (len >= 1 && str.charAt(0) == 'x') {
        str = str.substring(1);
        len--; 
    }

    if (len >= 1 && str.charAt(str.length() - 1) == 'x') {
        str = str.substring(0, str.length() - 1);
    }

    return str;
}
