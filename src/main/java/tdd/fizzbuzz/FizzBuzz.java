package tdd.fizzbuzz;

public class FizzBuzz {
    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String WHIZZ = "Whizz";
    public String countOff(int number) {
        String returnString = "";
        returnString = addFizz(number, returnString);
        returnString = addBuzz(number, returnString);
        returnString = addWhizz(number, returnString);
        return  returnString;
    }

    private String addWhizz(int number, String returnString) {
        if(number %7==0){
            returnString += WHIZZ;
        }
        return returnString;
    }

    private String addBuzz(int number, String returnString) {
        if(number %5==0){
            returnString += BUZZ;
        }
        return returnString;
    }

    private String addFizz(int number, String returnString) {
        if(number %3==0){
            returnString += FIZZ;
        }
        return returnString;
    }
}
