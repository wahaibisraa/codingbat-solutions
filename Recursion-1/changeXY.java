 public String changeXY(String str) {
        if (str.length() == 0) return "";
        char first = (str.charAt(0) == 'x') ? 'y' : str.charAt(0);
        return first + changeXY(str.substring(1));
    }