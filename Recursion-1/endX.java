 public String endX(String str) {
        if (str.length() <= 1) return str;
        String rest = endX(str.substring(1));
        if (str.charAt(0) == 'x') return rest + 'x';
        return str.charAt(0) + rest;
    }
