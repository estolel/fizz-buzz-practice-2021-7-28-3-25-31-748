package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";

    @Test
    void should_return_output_number_or_fizzbuzzwhen_when_number_given_value() {
        //given
        fizzBuzz = new FizzBuzz();
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber  = 7;
        int fourthNumber = 105;
        //when
        String firstOutput = fizzBuzz.countOff(firstNumber);
        String secondOutput = fizzBuzz.countOff(secondNumber);
        String thirdOutput = fizzBuzz.countOff(thirdNumber);
        String fourthOutput = fizzBuzz.countOff(fourthNumber);
        //then
        assertEquals(FIZZ, firstOutput);
        assertEquals(BUZZ, secondOutput);
        assertEquals(WHIZZ, thirdOutput);
        assertEquals(FIZZ+BUZZ+WHIZZ, fourthOutput);

    }



}
