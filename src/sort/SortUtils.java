package sort;

/**
 * Copyright (c) 2020, songchengen. All rights reserved.
 * 
 * @author songchengen
 * @date 2020-09-21
 * @version 0.0.1
 */
public final class SortUtils {
  public static <T> void exch(Comparable<T>[] a, int i, int j) {
    Comparable<T> t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  public static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  public static <T extends Comparable<T>> boolean isSorted(T[] a) {
    for (int i = 1; i < a.length; i ++) {
      if (less(a[i], a[i-1])) return false;
    }

    return true;
  }
}