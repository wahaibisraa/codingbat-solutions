public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (String s : strings) {
    map.put(s, map.getOrDefault(s, 0) + 1);
  }
  return map;
}
