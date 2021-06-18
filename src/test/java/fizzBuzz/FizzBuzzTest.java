package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static fizzBuzz.FizzBuzz.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    void returnNormalNumber() {
        assertEquals("1", fizzBuzz.converter(1));
        assertEquals("2", fizzBuzz.converter(2));
    }

    @Test
    void returnFizz() {   //return Fizz when it's a multiple of 3
        assertEquals("Fizz", fizzBuzz.converter(3));
        assertEquals("Fizz", fizzBuzz.converter(9));
    }

    @Test
    void returnFuzz() {   //return Fuzz when it's a multiple of 5
        assertEquals("Fuzz", fizzBuzz.converter(5));
        assertEquals("Fuzz", fizzBuzz.converter(10));
    }

    @Test
    void returnFizzBuzz(){   //return Fuzz when it's a multiple of 5 and 3
        assertEquals("FizzBuzz", fizzBuzz.converter(15));
        assertEquals("FizzBuzz", fizzBuzz.converter(30));
    }
}