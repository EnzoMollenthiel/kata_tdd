import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    private static final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzbuzz_should_return_empty_string_if_not_dividable_by_three_or_five() throws Exception {
        int n = 1;

        assertEquals("Should return empty string if not dividable by 3 or 5","", fizzBuzz.fizzbuzz(n));
    }

    @Test
    public void fizzbuzz_should_return_fizz_if_dividable_by_three() throws Exception {
        int n = 3;

        assertEquals("Should return Fizz if the integer is dividable by 3", "Fizz", fizzBuzz.fizzbuzz(n));
    }

}
