package com.hooitong.algorithms.adt;

import java.util.Iterator;

/**
 * @author Jarrett Yeap Hooi Tong <dev@hooitong.com>
 */
public class Bag<T> implements Iterable<T> {

  private Node first;
  private int size;

  private class Node {

    // containing the item and reference to the next node.
    T item;
    Node next;
  }

  public void add(T item) {
    Node prev = first;
    first = new Node();
    first.item = item;
    first.next = prev;
    size++;
  }

  public int size() {
    return size;
  }

  @Override
  public Iterator<T> iterator() {
    return new BagIterator();
  }

  private class BagIterator implements Iterator<T> {

    private Node current = first;

    @Override
    public boolean hasNext() {
      return current.next != null;
    }

    @Override
    public T next() {
      T item = current.item;
      current = current.next;
      return item;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("Cannot delete from bag.");
    }
  }
}
