public class FizzBuzz {

    public String fizzBuzz(int n) {
        String result = "";

        if(n % 3 == 0) result = "Fizz";
        else if (n % 5 == 0) result = "Buzz";

        if(n % 3 == 0 && n % 5 == 0) result = "FizzBuzz";

        return result;
    }
}