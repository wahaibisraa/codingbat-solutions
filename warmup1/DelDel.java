public String delDel(String str) {
        return (str.length() >= 4 && str.substring(1, 4).equals("del"))
                ? str.charAt(0) + str.substring(4)
                : str;
    }