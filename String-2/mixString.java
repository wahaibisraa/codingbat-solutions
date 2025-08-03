   public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(a.length(), b.length());
        for (int i = 0; i < min; i++) sb.append(a.charAt(i)).append(b.charAt(i));
        sb.append(a.substring(min)).append(b.substring(min));
        return sb.toString();
    }