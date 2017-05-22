package com.hooitong.algorithms.adt;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class BagTest {

  @Test
  public void add() throws Exception {
    Bag<Integer> integerBag = new Bag<>();
    integerBag.add(1);
    integerBag.add(2);
    assertEquals(2, integerBag.size());
  }

  @Test
  public void iterator() throws Exception {
    Bag<Integer> integerBag = new Bag<>();
    integerBag.add(1);
    integerBag.add(2);
    int start = 2;
    for (int i : integerBag) {
      assertEquals(start, i);
      start--;
    }
  }

}