public boolean lastDigit(int a, int b, int c) {
        int la = a % 10, lb = b % 10, lc = c % 10;
        return la == lb || la == lc || lb == lc;
    }