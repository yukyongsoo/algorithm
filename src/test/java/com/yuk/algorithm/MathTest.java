package com.yuk.algorithm;

import com.yuk.algorithm.maths.Maths;
import com.yuk.algorithm.maths.Numbers;
import org.junit.Test;

public class MathTest {
    @Test
    void numberTest() {
        Numbers n = new Numbers();
        System.out.println(n.sepNum(5432));
    }

    @Test
    void permutationTest() {
        int[] arr = { 4, 5, 6, 7 };
        Maths m = new Maths();
        m.permutation(arr, 0, 4, 2);
    }

    @Test
    void combinationTest() {
        int[] arr = { 8,9,10,11,12 };
        int size = 5;
        int data[] = new int[size];
        Maths m = new Maths();
        m.combination(arr, data, 0,  arr.length - 1, 0, size);
    }

    @Test
    void fiboTest() {
        int a = 2;
        Maths m = new Maths();
        System.out.println(m.fibo(a));
    }

    @Test
    void gcdNlcmTest() {
        int a = 16;
        int b = 40;
        Numbers n = new Numbers();
        System.out.println(n.getGCD(a, b));
        System.out.println(n.getLCM(a, b));
    }
}
