public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  StringBuilder result = new StringBuilder();
  
  for (String s : strings) {
    map.put(s, map.getOrDefault(s, 0) + 1);
    if (map.get(s) % 2 == 0) {
      result.append(s);
    }
  }
  return result.toString();
}
