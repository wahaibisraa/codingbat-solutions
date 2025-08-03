public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  Set<String> swapped = new HashSet<>();

  for (int i = 0; i < strings.length; i++) {
    String key = strings[i].substring(0, 1);
    if (swapped.contains(key)) continue;

    if (map.containsKey(key)) {
      int prevIndex = map.get(key);
      String temp = strings[i];
      strings[i] = strings[prevIndex];
      strings[prevIndex] = temp;
      swapped.add(key); // lock this key
    } else {
      map.put(key, i);
    }
  }
  return strings;
}
