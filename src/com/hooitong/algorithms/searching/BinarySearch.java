package com.hooitong.algorithms.searching;

/**
 * Binary search algorithm
 * <p>
 * Worst-case performance O(log n)<br>
 * Best-case performance O(1)<br>
 * Average performance O(log n)<br>
 * Worst-case space complexity O(1)<br>
 *
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */

public class BinarySearch {

  /**
   * Given a sorted integer array, find the given value in the array and return the index.
   * Otherwise, return -1.
   *
   * @param value the value to find in the array
   * @param array a sorted integer array
   * @return the found value otherwise -1
   */
  public static final int find(int value, int[] array) {
    // indices for low and high values
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = array[mid];
      if (value == guess) {
        return mid;
      } else if (value > guess) {
        low = mid + 1;
      } else if (value < guess) {
        high = mid - 1;
      }
    }

    return -1;
  }

  /**
   * Given a sorted integer array, find the given value in the array and return the index.
   * Otherwise, return -1.
   * <p>
   * This is implemented using recursion.
   *
   * @param value the value to find in the array
   * @param array a sorted integer array
   * @return the found value otherwise -1
   */
  public static final int findRecursive(int value, int[] array) {
    return recurse(0, array.length - 1, value, array);
  }

  private static final int recurse(int low, int high, int value, int[] array) {
    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;
    int guess = array[mid];
    if (value == guess) {
      return value;
    } else if (value > guess) {
      return recurse(mid + 1, high, value, array);
    } else {
      return recurse(low, mid - 1, value, array);
    }
  }
}