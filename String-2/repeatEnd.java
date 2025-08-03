 public String repeatEnd(String str, int n) {
        String sub = str.substring(str.length() - n);
        return sub.repeat(n);
    }