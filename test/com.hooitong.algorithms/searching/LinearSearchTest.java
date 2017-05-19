package com.hooitong.algorithms.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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