    public String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i + 1 < str.length() && str.charAt(i + 1) == '*') continue;
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }