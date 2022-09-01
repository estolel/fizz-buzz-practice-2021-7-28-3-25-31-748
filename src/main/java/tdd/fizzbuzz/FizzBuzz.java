package tdd.fizzbuzz;

public class FizzBuzz {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";
    public String countOff(int firstNumber) {
        String returnString = "";
        if(firstNumber%3==0){
            returnString = FIZZ;
        }
        return  returnString;
    }
}
