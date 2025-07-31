   public int[] tenRun(int[] nums) {
        int current = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) current = nums[i];
            else if (current != -1) nums[i] = current;
        }
        return nums;
    }