public boolean stringE(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') count++;
        }
        return count >= 1 && count <= 3;
    }