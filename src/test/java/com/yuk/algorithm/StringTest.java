package com.yuk.algorithm;

import com.yuk.algorithm.etc.Strings;
import org.junit.Test;

public class StringTest {
    @Test
    void makepointComma() {
        Strings s = new Strings();
        long value = 19871597114L;
        String ans = s.makepointComma(value, 4);
        System.out.println(ans);
    }

    @Test
    void itoaNatoiTest() {
        int a = 16;
        String b = "16";
        Strings s = new Strings();
        System.out.println(s.atoi(b));
        System.out.println(s.itoa(a,10));
    }
}
