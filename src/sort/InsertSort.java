package sort;

/**
 * Copyright (c) 2020, songchengen. All rights reserved.
 * 
 * @author songchengen
 * @date 2020-09-21
 * @version 0.0.1
 */
public class InsertSort<T> {
  public static <T extends Comparable<T>> void sort(T[] a) {
    int n = a.length;

    for (int i = 1; i < n; i ++) {
      for (int j = i; j > 0 && SortUtils.less(a[j], a[j - 1]); j--) {
        SortUtils.exch(a, j, j-1);
      }
    }
  }
}