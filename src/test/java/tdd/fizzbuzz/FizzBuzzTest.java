package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import

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
//        int secondNumber = 5;
//        int thirdNumber  = 21;
//        int fourthNumber = 105;
        //when
        String firstOutput = fizzBuzz.countOff(firstNumber);
//        String secondOutput = fizzBuzz.countOff(secondNumber);
//        String firstOutput = fizzBuzz.countOff(thirdNumber);
//        String firstOutput = fizzBuzz.countOff(fourthNumber);
        //then
        assertEquals(FIZZ, firstOutput);

    }



}
