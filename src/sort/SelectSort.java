package sort;

/**
 * Copyright (c) 2020, songchengen. All rights reserved.
 * 
 * @author songchengen
 * @date 2020-09-21
 * @version 0.0.1
 */
public class SelectSort {
  public static <T extends Comparable<T>> void sort(T[] a) {
    int n = a.length;

    for (int i = 0; i < n; i ++) {
      int min = i;

      for (int j = i + 1; j < n; j ++) {
        if (SortUtils.less(a[j], a[min])) min = j;
      }

      SortUtils.exch(a, i, min);

    }
  }
}