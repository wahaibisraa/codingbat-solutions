public String withoutX2(String str) {
   if (str.length() >= 2) {
            if (str.startsWith("xx")) {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }
        return str;
}
