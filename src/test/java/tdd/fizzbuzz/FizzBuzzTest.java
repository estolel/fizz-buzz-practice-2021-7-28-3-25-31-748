package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    static FizzBuzz fizzBuzz;
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";
    @BeforeAll
    static void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_output_number_or_fizzbuzzwhen_when_number_given_value() {
        //given
        int fourthNumber = 105;
        //when
        String fourthOutput = fizzBuzz.countOff(fourthNumber);

        //then
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
    @Test
    void should_return_buzz_when_count_off_given_multiple_of_5() {
        //given
        int secondNumber = 5;

        //when
        String secondOutput = fizzBuzz.countOff(secondNumber);

        //then
        assertEquals(BUZZ, secondOutput);
    }
    @Test
    void should_return_whizz_when_count_off_given_multiple_of_7() {
        //given
        int thirdNumber  = 7;

        //when
        String thirdOutput = fizzBuzz.countOff(thirdNumber);

        //then
        assertEquals(WHIZZ, thirdOutput);
    }
    @Test
    void should_return_fizzwhizz_when_count_off_given_multiple_of_7_and_3() {
        //given
        int fourthNumber  = 21;

        //when
        String fourthOutput = fizzBuzz.countOff(fourthNumber);

        //then
        assertEquals(FIZZ+WHIZZ, fourthOutput);
    }
    @Test
    void should_return_fizzbuzz_when_count_off_given_multiple_of_5_and_3() {
        //given
        int number  = 15;

        //when
        String output = fizzBuzz.countOff(number);

        //then
        assertEquals(FIZZ+BUZZ, output);
    }
    @Test
    void should_return_buzzwhizz_when_count_off_given_multiple_of_7_and_5() {
        //given
        int number  = 35;

        //when
        String output = fizzBuzz.countOff(number);

        //then
        assertEquals(BUZZ+WHIZZ, output);
    }




}
