class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                str.add("FizzBuzz");
            } else if ((i % 5 == 0)) {
                str.add("Buzz");
            } else if ((i % 3 == 0)) {
                str.add("Fizz");
            } else
                str.add(String.valueOf(i));
        }
        return str;

    }
}
