public String fizzString(String str) {
        boolean fizz = str.startsWith("f");
        boolean buzz = str.endsWith("b");
        if (fizz && buzz) return "FizzBuzz";
        if (fizz) return "Fizz";
        if (buzz) return "Buzz";
        return str;
    }