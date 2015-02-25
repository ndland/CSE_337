package hw2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MatchingRuleTest {
	
	private MatchingRule matchingRule;
	private String s1 = "xyyz";

	@Before
	public void setUp() throws Exception {
		matchingRule = new MatchingRule();
	}
	
	@Test
	public void testIsValidSourceReturnsTrueWhenGivenAStringThatContainsCharsFromTheDefaultSource() {
		assertTrue(matchingRule.isValidSource(s1));
	}

    @Test
    public void testIsValidSourceReturnsFalseWhenGivenAStringThatDoesNotContainCharsFromTheDefaultSource() {
        assertFalse(matchingRule.isValidSource("0"));
    }

    @Test
    public void testThatMatchesReturnsTrueWhenGivenTwoMatchingChars() {
        assertTrue(matchingRule.matches('a', 'a'));
    }

    @Test
    public void testThatMatchesReturnsFalseWhenGivenTwoNonMatchingChars() {
        assertFalse(matchingRule.matches('a', 'b'));
    }
}