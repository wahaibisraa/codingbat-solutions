    public boolean no14(int[] nums) {
        boolean has1 = false, has4 = false;
        for (int num : nums) {
            if (num == 1) has1 = true;
            if (num == 4) has4 = true;
        }
        return !(has1 && has4);
    }