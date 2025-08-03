public boolean nearTen(int num) {
        int rem = num % 10;
        return rem <= 2 || rem >= 8;
    }