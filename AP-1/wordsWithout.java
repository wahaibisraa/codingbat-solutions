public String[] wordsWithout(String[] words, String target) {
  List<String> list = new ArrayList<>();
  for (String w : words) {
    if (!w.equals(target)) list.add(w);
  }
  return list.toArray(new String[0]);
}