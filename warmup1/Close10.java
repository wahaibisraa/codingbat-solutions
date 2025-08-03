public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);
        return diffA < diffB ? a : (diffA > diffB ? b : 0);
    }