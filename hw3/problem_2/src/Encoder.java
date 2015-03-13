/**
 * Created by Nick on 3/13/15.
 */
public class Encoder implements Processor {

    private int shift;

    public Encoder(int shift) {
        if (shift < 26) {
            this.shift = shift;
        }
        else{
            System.out.println("The shift amount must be less than 26");
        }
    }

    @Override
    public String process(String s) {
        String result = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = (char) (s.charAt(i) + this.shift);
            if (c > 'z')
                result += (char) (s.charAt(i) - (26 - this.shift));
            else {
                result += (char) (s.charAt(i) + this.shift);
            }
        }
        return result;
    }
}
