    public boolean has12(int[] nums) {
        boolean seen1 = false;
        for (int num : nums) {
            if (num == 1) seen1 = true;
            if (seen1 && num == 2) return true;
        }
        return false;
    }