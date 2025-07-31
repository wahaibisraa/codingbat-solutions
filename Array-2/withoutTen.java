  public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int num : nums) if (num != 10) result[j++] = num;
        return result;
    }