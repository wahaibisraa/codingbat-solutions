public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<>();
  Map<String, Integer> count = new HashMap<>();
  
  for (String s : strings) {
    count.put(s, count.getOrDefault(s, 0) + 1);
  }
  for (String s : count.keySet()) {
    map.put(s, count.get(s) >= 2);
  }
  return map;
}
