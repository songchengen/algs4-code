package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.InsertSort;
import sort.SelectSort;
import sort.SortUtils;

/**
 * Copyright (c) 2020, songchengen. All rights reserved.
 * 
 * @author songchengen
 * @date 2020-09-21
 * @version 0.0.1
 */
public class SortTest {

  @Test
  public void select() {

    String[] a = {"x", "z", "j", "m", "c", "k"};

    assertTrue(!SortUtils.isSorted(a));

    SelectSort.sort(a);

    assertTrue(SortUtils.isSorted(a));
  }

  @Test
  public void insert() {
    String[] a = {"x", "z", "j", "m", "c", "k"};

    assertTrue(!SortUtils.isSorted(a));

    InsertSort.sort(a);

    assertTrue(SortUtils.isSorted(a));
  }
}