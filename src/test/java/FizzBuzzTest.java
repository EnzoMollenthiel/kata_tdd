import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    private static final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_should_return_empty_string_if_not_dividable_by_three_or_five() {
        int n = 1;

        assertEquals("Should return empty string if not dividable by 3 or 5","", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void fizzBuzz_should_return_fizz_if_dividable_by_three() {
        int n = 3;

        assertEquals("Should return Fizz if the integer is dividable by 3", "Fizz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void fizzBuzz_should_return_buzz_if_dividable_by_five() {
        int n = 5;

        assertEquals("Should return Buzz if the integer is dividable by 3", "Buzz", fizzBuzz.fizzBuzz(n));
    }

    @Test
    public void fizzBuzz_should_return_fizzBuzz_if_dividable_by_three_and_five() {
        int n = 15;

        assertEquals("Should return FizzBuzz if the integer is dividable by 3 and 5", "FizzBuzz", fizzBuzz.fizzBuzz(n));
    }
}
