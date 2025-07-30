  public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) sb.append(str.substring(0, i));
        return sb.toString();
    }