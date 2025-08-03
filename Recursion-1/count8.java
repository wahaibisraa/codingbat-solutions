public int count8(int n) {
        if (n == 0) return 0;
        int last = n % 10;
        int count = 0;
        if (last == 8) {
            if ((n / 10) % 10 == 8) count = 2; // double count if next digit also 8
            else count = 1;
        }
        return count + count8(n / 10);
    }