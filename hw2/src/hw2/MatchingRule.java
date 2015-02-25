package hw2;

public class MatchingRule {

	private String source;
	private String target;
	private Boolean valid = false;

	public MatchingRule() {
		source = "abcdefghijklmnopqrstuvwxyz";
		target = source;
	}
	
	public MatchingRule(String givenSourceChars, String givenTargetChars) {
		source = givenSourceChars;
		target = givenTargetChars;
	}
	
	public boolean matches(char sourceChar, char targetChar) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == sourceChar) {
                if (i >= target.length() || target.charAt(i) == targetChar)
                    return true;
            }
        }
        return false;
	}
	
	public boolean isValidSource(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (source.indexOf(s.charAt(i)) < 0) {
				return false;
			}
		}
		return true;
	}
}
