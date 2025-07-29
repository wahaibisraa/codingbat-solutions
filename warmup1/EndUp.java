public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        int cut = str.length() - 3;
        return str.substring(0, cut) + str.substring(cut).toUpperCase();
    }