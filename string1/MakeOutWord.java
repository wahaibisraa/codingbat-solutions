public String makeOutWord(String out, String word) {
  String start = out.substring(0, 2);
        String end = out.substring(2);
        return start + word + end;
}
