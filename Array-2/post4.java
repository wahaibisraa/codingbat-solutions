  public int[] post4(int[] nums) {
        int i = nums.length - 1;
        while (nums[i] != 4) i--;
        int[] result = new int[nums.length - i - 1];
        System.arraycopy(nums, i + 1, result, 0, result.length);
        return result;
    }