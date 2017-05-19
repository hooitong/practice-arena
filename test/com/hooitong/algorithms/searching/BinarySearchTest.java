package com.hooitong.algorithms.searching;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class BinarySearchTest {

  @Test
  public void find() throws Exception {
    int[] mockList = {1, 3, 5, 7, 9};
    assertEquals(1, BinarySearch.find(3, mockList));
    assertEquals(-1, BinarySearch.find(11, mockList));
  }

  @Test
  public void findRecursive() throws Exception {
    int[] mockList = {1, 3, 5, 7, 9};
    assertEquals(1, BinarySearch.find(3, mockList));
    assertEquals(-1, BinarySearch.find(11, mockList));
  }

}