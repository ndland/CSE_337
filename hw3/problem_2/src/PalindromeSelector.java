/**
 * Created by Nick on 3/13/15.
 */
public class PalindromeSelector implements Predicate {

    public PalindromeSelector() {

    }

    @Override
    public boolean accept(String s) {
        return (s.equals(new StringBuffer(s).reverse().toString()));
    }
}
