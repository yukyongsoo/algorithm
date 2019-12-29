package com.yuk.algorithm;

import com.yuk.algorithm.searcher.Sorts;
import org.junit.Test;

public class SortTest {
    @Test
    void quickSortTest() {
        int[] arr = new int[]{2,0,2,1,1,0};
        Sorts s = new Sorts();
        s.quickSort(arr, 0, arr.length-1);
    }
}
