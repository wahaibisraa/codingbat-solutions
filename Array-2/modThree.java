  public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean even = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0;
            boolean odd = nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0;
            if (even || odd) return true;
        }
        return false;
    }