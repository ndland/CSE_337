import java.util.ArrayList;

/**
 * Utilities for processing lists of strings.
 */
public class ArrayProcessingUtil
{

  /**
   * Applies a Processor to every string in the given array, 
   * returning a list of the transformed strings.
   * @param arr
   *   given array of strings
   * @param processor
   *   the Processor to be applied to each string
   * @return
   *   list of all transformed strings, in the same order as given
   */
  public static ArrayList<String> applyAll(String[] arr, Processor processor)
  {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < arr.length; ++i)
    {
      result.add(processor.process(arr[i]));
    }
    return result;
  }
  
  /**
   * Returns all strings in the given array satisfying the given Predicate.
   * @param arr
   *   given array of strings
   * @param predicate
   *   the Predicate to be used for selecting strings for the returned list
   * @return
   *   list of all strings accepted by the Predicate, in the same order as given
   */
  public static ArrayList<String> select(String[] arr, Predicate predicate)
  {
      ArrayList<String> result = new ArrayList<String>();
      for (int i = 0; i < arr.length; ++i) {
          if (predicate.accept(arr[i])) {
              result.add(arr[i]);
          }
      }
      return result;
  }
  
  /**
   * Applies a Processor to all strings in the given array that satisfy
   * the given Predicate, returning a list of the transformed selected
   * strings.
   * @param arr
   *   given array of strings
   * @param processor
   *   the Processor to be applied to each string
   * @param predicate
   *   the Predicate to be used for selecting strings for the returned list
   * @return
   *   list of all transformed selected strings, in the same order as given
   */
  public static ArrayList<String> apply(String[] arr, Processor processor, Predicate predicate) {
      ArrayList<String> result = new ArrayList<String>();
      for (int i = 0; i < arr.length; ++i) {
          if (predicate.accept(processor.process(arr[i]))) {
              result.add(arr[i]);
          }
      }
      return result;
  }


}
