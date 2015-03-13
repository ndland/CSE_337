/**
 * A Processor is an abstraction of a string-processing
 * operation with a String input and a String output.
 */
public interface Processor
{
  /**
   * Processes the given String and returns the result.
   * @param s
   *   the String to be processed
   * @return
   *   the new String after processing
   */
  public String process(String s);
}
