package com.my;

import com.my.constant.ConstantClass;
import com.my.utils.ArrayConvertUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @date 2019-08-11
 * combinate letter
 */
public class TelephoneLetter {

    /**
     * combinate Letter by input array
     * @param arrayParam
     * @return
     */
    public static List<String> combinateLetter(int[] arrayParam) {
        /*
        convert the input array to string
         */
        String arrayParamStr = ArrayConvertUtil.convertArrayToString(arrayParam);
        String digitString ="";
        if (arrayParam.length > 0 && arrayParamStr.length() > 0) {
            /*
            remove the digit which is with empty letter
             */
            digitString = arrayParamStr.replace("0", "").replace("1", "");
        }
        /*
        return result
         */
        List<String> returnList = new ArrayList<String>();

        String midianValue = "";
        if ("".equals(digitString)) {
            return returnList;
        }
        String[] phoneLetterDict = ConstantClass.PHONE_LETTER_DICT;
        /*
        digit array which all contain letter
         */
        int[] digitIntArray = new int[digitString.length()];
        for (int i = 0; i < digitString.length(); i++) {
            digitIntArray[i] = digitString.charAt(i) ;
        }
        combineProcess(digitIntArray, 0, phoneLetterDict, returnList, midianValue);
        return returnList;
    }

    /**
     * combine Process
     * @param digitIntArray
     * @param circulateTimes
     * @param phoneLetterDict
     * @param returnList
     * @param midianCombinedValue
     */
    private static void combineProcess(int[] digitIntArray, int circulateTimes, String[] phoneLetterDict, List<String> returnList, String midianCombinedValue) {
        /*
        have circulated all the digits array
         */
        if (circulateTimes == digitIntArray.length) {
            returnList.add(midianCombinedValue);
            return;
        }
        /*
           combine all the letter by circulating the digits array
         */
        for (int j = 0; j < phoneLetterDict[digitIntArray[circulateTimes]].length(); j++) {
            midianCombinedValue = midianCombinedValue + phoneLetterDict[digitIntArray[circulateTimes]].charAt(j);
            combineProcess(digitIntArray, circulateTimes + 1, phoneLetterDict, returnList, midianCombinedValue);
            /*
            look back the letter, like setting ab to a
             */
            midianCombinedValue = midianCombinedValue.substring(0, midianCombinedValue.length() - 1);
        }
    }

}
