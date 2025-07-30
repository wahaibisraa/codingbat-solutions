public int caughtSpeeding(int speed, boolean isBirthday) {
        int buffer = isBirthday ? 5 : 0;
        if (speed <= 60 + buffer) return 0;
        if (speed <= 80 + buffer) return 1;
        return 2;
    }