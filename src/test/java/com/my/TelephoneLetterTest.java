package com.my;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

/**
 * @author admin
 * @date 2019-08-11
 * Unit test
 */
public class TelephoneLetterTest {

    @Test
    public void testTelphoneLetterWithArray() {

         /*
        test digits which has no letter
         */
        int[] noLetter = {1, 0, 10, 01, 11, 00};
        List<String> returnEmptyList = TelephoneLetter.combinateLetter(noLetter);
        System.out.println(returnEmptyList.toString());
        String expectEmptyResult = "[]";
        Assert.assertEquals("Digits with empty letter, the result should be: " + expectEmptyResult, expectEmptyResult, returnEmptyList.toString());

         /*
        test largest digits
         */
        int[] largestDigit = {99};
        List<String> listLarge = TelephoneLetter.combinateLetter(largestDigit);
        System.out.println(listLarge.toString());
        String expectedLargeResult = "[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]";
        Assert.assertEquals("largest digit, the result should be: " + expectedLargeResult, expectedLargeResult, listLarge.toString());

         /*
        test mix digits
         */
        int[] mixDigit = {1,0,10,11,00,01,99};
        List<String> listMix = TelephoneLetter.combinateLetter(mixDigit);
        System.out.println(listMix.toString());
        String expectedMixResult = "[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]";
        Assert.assertEquals("mixed digits, the result should be: " + expectedMixResult, expectedMixResult, listMix.toString());

        /*
        test normal digits
         */
        int[] normalDigit = {2,3,9};
        List<String> listNormal = TelephoneLetter.combinateLetter(normalDigit);
        System.out.println(listNormal.toString());
        String expectedNormalResult = "[adw, adx, ady, adz, aew, aex, aey, aez, afw, afx, afy, afz, bdw, bdx, bdy, bdz, bew, bex, bey, bez, bfw, bfx, bfy, bfz, cdw, cdx, cdy, cdz, cew, cex, cey, cez, cfw, cfx, cfy, cfz]";
        Assert.assertEquals("normal digits, the result should be: " + expectedNormalResult, expectedNormalResult, listNormal.toString());

    }

}
