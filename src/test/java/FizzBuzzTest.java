import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    private static final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzbuzz_should_return_empty_string_if_not_dividable_by_three_or_five() throws Exception {
        int n = 1;

        assertEquals("", fizzBuzz.fizzbuzz(n));
    }
}
