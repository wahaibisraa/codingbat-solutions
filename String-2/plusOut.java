   public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                sb.append(word);
                i += word.length();
            } else {
                sb.append('+');
                i++;
            }
        }
        return sb.toString();
    }