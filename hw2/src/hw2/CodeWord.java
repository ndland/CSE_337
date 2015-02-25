package hw2;

public class CodeWord {

    private String sourceWord;
    private MatchingRule rule;
    private int totalCount;
    private int totalMatches;
	
	public CodeWord(String givenData) {
        sourceWord = givenData;
        rule = new MatchingRule();
	}
	
	public CodeWord(String givenData, MatchingRule givenRule) {
        sourceWord = givenData;
        rule = givenRule;
	}
	
	public int letterCount(char ch) {
        totalCount = 0;
        for (int i = 0; i < sourceWord.length(); i++) {
            if (sourceWord.charAt(i) == ch)
                totalCount++;
        }
        return totalCount;
	}
	
	public int maxMatches(String target) {
        for (int i = 0; i < sourceWord.length() - 1; i++) {
            countMatchesInRightShift(target, i);
            if (totalCount > totalMatches)
                totalMatches = totalCount;
        }

        for (int i = 0; i < sourceWord.length() - 1; i++) {
            countMatchesInLeftShift(target, i);
            if (totalCount > totalMatches)
                totalMatches = totalCount;
        }
        return totalMatches;
	}
	
	public int countMatchesUnshifted(String target) {
        return countMatchesInRightShift(target, 0);
	}
	
	public int countMatchesInRightShift(String target, int shiftAmount) {
        totalCount = 0;
        int i = 0;
        while (i < target.length() && i + shiftAmount < sourceWord.length() ) {
            if (rule.matches(sourceWord.charAt(i + shiftAmount), target.charAt(i))) {
                totalCount++;
            }
        }
        i++;
        return totalCount;
	}

	public int countMatchesInLeftShift(String target, int shiftAmount) {
        totalCount = 0;
        int i = 0;
        while (i < target.length() && i + shiftAmount < sourceWord.length() ) {
            if (rule.matches(sourceWord.charAt(i), target.charAt(i + shiftAmount))) {
                totalCount++;
            }
        }
        i++;
        return totalCount;
	}
}
