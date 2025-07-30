public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) sb.append(c).append(c);
        return sb.toString();
    }