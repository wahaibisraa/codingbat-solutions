    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) sb.append(str.charAt(i - 1));
                if (i + word.length() < str.length()) sb.append(str.charAt(i + word.length()));
            }
        }
        return sb.toString();
    }