 public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : (b > a && c > b);
    }