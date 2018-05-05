package com.base.interview;

import java.util.Comparator;

public class ComparableAndComparatorPositiveCases {

  /** implements both interfaces */
  // BUG: Diagnostic contains: Class should not implement both
  public static class BadClass implements Comparable<BadClass>, Comparator<BadClass> {
    @Override
    public int compareTo(BadClass comparableNode) {
      return 0;
    }

    @Override
    public int compare(BadClass a, BadClass b) {
      return 0;
    }
  }

  /** Superclass test class */
  public static class SuperClass implements Comparator<SuperClass> {
    @Override
    public int compare(SuperClass o1, SuperClass o2) {
      return 0;
    }
  }

  /** SubClass test class */
  // BUG: Diagnostic contains: Class should not implement both
  public static class SubClass extends SuperClass implements Comparable<SubClass> {
    @Override
    public int compareTo(SubClass o) {
      return 0;
    }
  }
}