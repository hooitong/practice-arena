package com.hooitong.algorithms.sorting;

import static org.junit.Assert.*;

import com.hooitong.algorithms.searching.LinearSearch;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class SelectionSortTest {

  @Test
  public void sort() throws Exception {
    int[] mockArray = {1, 5, 6, 7, 3};
    int[] expectedResult = {1, 3, 5, 6, 7};
    assertTrue(Arrays.equals(SelectionSort.sort(mockArray), expectedResult));
  }

}