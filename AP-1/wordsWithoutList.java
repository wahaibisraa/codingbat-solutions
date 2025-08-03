public List<String> wordsWithoutList(String[] words, int len) {
  List<String> result = new ArrayList<>();
  for (String w : words) {
    if (w.length() != len) result.add(w);
  }
  return result;
}