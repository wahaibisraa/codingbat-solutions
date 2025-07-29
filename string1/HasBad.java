public boolean hasBad(String str) {
          return (str.startsWith("bad") || (str.length() > 3 && str.substring(1, 4).equals("bad")));

}
