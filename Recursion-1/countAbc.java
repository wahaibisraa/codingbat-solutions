 public int countAbc(String str) {
        if (str.length() < 3) return 0;
        int count = 0;
        String sub = str.substring(0, 3);
        if (sub.equals("abc") || sub.equals("aba")) count = 1;
        return count + countAbc(str.substring(1));
    }
