   public boolean xyzMiddle(String str) {
        int len = str.length();
        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int before = i;
                int after = len - (i + 3);
                if (Math.abs(before - after) <= 1) return true;
            }
        }
        return false;
    }
