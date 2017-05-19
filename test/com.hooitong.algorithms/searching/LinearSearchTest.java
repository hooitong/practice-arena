package com.hooitong.algorithms.searching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
class LinearSearchTest {

  @Test
  void find() {
    int[] mockArray = {1, 5, 6, 7, 3};
    assertEquals(3, LinearSearch.find(3, mockArray));
  }

}