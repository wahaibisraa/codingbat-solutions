public int count7(int n) {
        if (n == 0) return 0;
        int count = (n % 10 == 7) ? 1 : 0;
        return count + count7(n / 10);
    }
