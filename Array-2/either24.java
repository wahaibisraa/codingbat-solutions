  public boolean either24(int[] nums) {
        boolean two = false, four = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) two = true;
            if (nums[i] == 4 && nums[i + 1] == 4) four = true;
        }
        return two ^ four;
    }