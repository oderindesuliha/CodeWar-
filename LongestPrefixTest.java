import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*


public class LongestPrefixTest{

	@Test
	public void testLongestPrefix{
	
	String[] input = {"flower", "flow", "flight"};
	String expected = "fl";
	String actual = LongestPrefix.prefix(input);
	assertEquals(expected, actual);
}
}