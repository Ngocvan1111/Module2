package ss8_clean_code_and_refactoring.practive.refactoring_spilit_variable;



public class FizzBuzz {
    public static String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
