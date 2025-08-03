public Map<String, String> mapAB3(Map<String, String> map) {
        boolean aHas = map.containsKey("a");
        boolean bHas = map.containsKey("b");
        if (aHas && !bHas) {
            map.put("b", map.get("a"));
        } else if (!aHas && bHas) {
            map.put("a", map.get("b"));
        }
        return map;
    }