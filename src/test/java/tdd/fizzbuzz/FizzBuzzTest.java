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
        int secondNumber = 5;
        int thirdNumber  = 7;
        int fourthNumber = 105;
        int fifthNumber = 15;
        int sixthNumber = 15;
        //when
        String secondOutput = fizzBuzz.countOff(secondNumber);
        String thirdOutput = fizzBuzz.countOff(thirdNumber);
        String fourthOutput = fizzBuzz.countOff(fourthNumber);

        //then
        assertEquals(BUZZ, secondOutput);
        assertEquals(WHIZZ, thirdOutput);
        assertEquals(FIZZ+BUZZ+WHIZZ, fourthOutput);

    }

    @Test
    void should_return_fizz_when_count_off_given_multiple_of_3() {
        //given

        int firstNumber = 3;

        //when
        String firstOutput = fizzBuzz.countOff(firstNumber);

        //then
        assertEquals(FIZZ, firstOutput);
    }




}
