   public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0, odd = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) result[even++] = num;
            else result[odd--] = num;
        }
        int[] merged = new int[nums.length];
        System.arraycopy(result, 0, merged, 0, even);
        for (int i = nums.length - 1, j = even; j < nums.length; j++, i--) merged[j] = result[i];
        return merged;
    }
