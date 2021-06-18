package fizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FizzBuzzApplication {

	private static FizzBuzz fizzBuzz = new FizzBuzz();

	public static void main(String[] args) {

		SpringApplication.run(FizzBuzzApplication.class, args);
		fizzBuzz.playFizzBuzz();
	}

}


