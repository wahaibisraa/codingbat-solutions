public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");
            if (aVal.length() > bVal.length()) {
                map.put("c", aVal);
            } else if (bVal.length() > aVal.length()) {
                map.put("c", bVal);
            }
        }
        return map;