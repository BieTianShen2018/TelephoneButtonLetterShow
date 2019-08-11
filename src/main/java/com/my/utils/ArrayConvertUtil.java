package com.my.utils;

/**
 * @author admin
 * @date 2019-08-11
 * tools
 */
public class ArrayConvertUtil {

    /**
     * @param arrayParam
     * @return
     */
    public  static String convertArrayToString(int[] arrayParam){
        StringBuilder returnedValue= new StringBuilder();
        for (int i = 0; i < arrayParam.length; i++) {
            if (arrayParam[i] != 1 && arrayParam[i] != 0) {
                returnedValue.append(arrayParam[i]);
            }
        }
        return  returnedValue.toString();
    }
}
