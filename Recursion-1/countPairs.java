 public int countPairs(String str) {
        if (str.length() < 3) return 0;
        int count = (str.charAt(0) == str.charAt(2)) ? 1 : 0;
        return count + countPairs(str.substring(1));
    }