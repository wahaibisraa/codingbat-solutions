public int centeredAverage(int[] nums) {
        int sum = 0, min = nums[0], max = nums[0];
        for (int num : nums) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return (sum - min - max) / (nums.length - 2);
    }