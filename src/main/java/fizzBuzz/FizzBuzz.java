package fizzBuzz;

public class FizzBuzz {


    public String converter(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Fuzz";
        } else {
            return Integer.toString(i);
        }
    }

    public void playFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(converter(i));
        }
    }
}
