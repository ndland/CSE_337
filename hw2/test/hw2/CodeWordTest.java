package hw2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CodeWordTest {

    private CodeWord cw;

	@Before
	public void setUp() throws Exception {
        cw = new CodeWord("Test");
	}

    @Test
    public void testLetterCount() {
        cw.letterCount('c');
    }
}
