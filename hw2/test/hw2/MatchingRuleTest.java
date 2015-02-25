package hw2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatchingRuleTest {
	
	private MatchingRule matchingRule;
	private String s = "abcdefghijklmnopqrstuvwxyz";
	private String s1 = "xyyz";

	@Before
	public void setUp() throws Exception {
		matchingRule = new MatchingRule("xbmc", "cmbx");
	}
	
	@Test
	public void testIsValidSourceIsValid() {
		assertTrue(matchingRule.isValidSource(s));
		assertTrue(matchingRule.isValidSource(s1));
	}
}