  public int sum67(int[] nums) {
        int sum = 0;
        boolean inRange = false;
        for (int num : nums) {
            if (num == 6) inRange = true;
            if (!inRange) sum += num;
            if (num == 7 && inRange) inRange = false;
        }
        return sum;
    }