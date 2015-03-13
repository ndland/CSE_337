/**
 * A Processor is an abstraction of a string-processing
 * operation with a String input and a String output.
 */
public interface Processor {
    /**
     * Processes the given String and returns the result.
     *
     * @param s the String to be processed
     * @return the new String after processing
     */
    public String process(String s);

    public class Encoder implements Processor {

        private int shift;

        public Encoder(int shift) {
            if (shift < 26) {
                this.shift = shift;
            } else {
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
}
