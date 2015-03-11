package hw3;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by Nick on 3/10/15.
 */
public class AverageScoreCalculatorTest {

    @Test
    public void testReadFileReadsTheFileCorrectly() {
        String expected =  "Leslie Muller 77 88 99 100";
        AverageScoreCalculator avg = new AverageScoreCalculator("test.txt", "out.txt");
        assertThat(avg.readFile(), CoreMatchers.containsString(expected));
    }
}
