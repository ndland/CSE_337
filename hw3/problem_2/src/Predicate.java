/**
 * A Predicate is an abstraction of a decision operation
 * for selecting a subset from a given set of strings.
 */
public interface Predicate
{
  /**
   * Determines whether the given string should be selected.
   * @param s
   *   the given string
   * @return
   *   true if s should be selected, false otherwise
   */
  public boolean accept(String s);
}
