package com.hooitong.algorithms.sorting;

/**
 * Selection sort algorithm
 * <p>
 * Worst-case performance O(n^2)<br>
 * Best-case performance O(n^2)<br>
 * Average performance O(n^2)<br>
 * Worst-case space complexity O(1)<br>
 *
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class SelectionSort {

  /**
   * Sort a given integer array in ascending order using selection sort.
   *
   * @param array an integer array
   * @return sorted integer array in ascending order
   */
  public static final int[] sort(int[] array) {
    int i = 0;

    while (i < array.length) {
      // find the smallest element in the right sub-list
      int smallest = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[smallest] > array[j]) {
          smallest = j;
        }
      }
      swap(i, smallest, array);
      i++;
    }

    return array;
  }

  private static void swap(int first, int second, int[] array) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
  }
}
