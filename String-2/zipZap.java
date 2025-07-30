  public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sb.append("zp");
                i += 3;
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }