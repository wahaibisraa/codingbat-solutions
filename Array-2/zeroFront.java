  public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int num : nums) if (num == 0) result[j++] = 0;
        for (int num : nums) if (num != 0) result[j++] = num;
        return result;
    }