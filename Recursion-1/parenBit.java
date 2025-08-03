 public String parenBit(String str) {
        if (str.charAt(0) == '(') {
            int close = str.indexOf(')');
            return str.substring(0, close + 1);
        }
        return parenBit(str.substring(1));
    }