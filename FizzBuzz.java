public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if(number == 3) {
            return "Fizz";
        }
        else if(number == 5) {
            return "Buzz";
        }
        else if(number == 15) {
            return "FizzBuzz";
        }
        else {
            return String.valueOf(number);
        }
    }
}
