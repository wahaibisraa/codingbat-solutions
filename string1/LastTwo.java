public String lastTwo(String str) {
  if (str.length() < 2) {
            return str; 
        }
        int len = str.length();
        String start = str.substring(0, len - 2);
        char secondLast = str.charAt(len - 2);
        char last = str.charAt(len - 1);
        return start + last + secondLast;
}
