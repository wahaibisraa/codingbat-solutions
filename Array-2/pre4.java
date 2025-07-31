
    public int[] pre4(int[] nums) {
        int i = 0;
        while (nums[i] != 4) i++;
        int[] result = new int[i];
        System.arraycopy(nums, 0, result, 0, i);
        return result;
    }