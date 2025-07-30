
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        return word + sep.repeat(count - 1) + word.repeat(count - 1);
    }