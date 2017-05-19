package com.hooitong.algorithms.searching;

/**
 * Linear search algorithm
 * <p>
 * Worst-case performance O(n)<br>
 * Best-case performance O(1)<br>
 * Average performance O(n)<br>
 * Worst-case space complexity O(1)<br>
 *
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class LinearSearch {

  /**
   * Finds the given value in the given array and returns the value if found. Otherwise,
   * returns Integer.MAX_VALUE
   *
   * @param value the integer to be found
   * @param array an array of integers
   * @return value that was found else Integer.MAX_VALUE
   */
  public static final int find(int value, int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (value == array[i]) {
        return value;
      }
    }
    return Integer.MAX_VALUE;
  }
}
