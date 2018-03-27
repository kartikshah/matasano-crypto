package com.kartikshah.matasano;

import javax.xml.bind.DatatypeConverter;

/**
 * Created by kartik on 4/7/16.
 */
public class Utils
{
    public static void singleCharacterXORdecoder(String hexString1)
    {
        byte[] b4 = DatatypeConverter.parseHexBinary(hexString1);
        for (char j = (char)0; j < (char)256; j++)
        {
            byte b5[] = new byte[b4.length];
            for (int i = 0; i < b4.length; i++){
                int xorTemp = (int)b4[i] ^ (int)j;
                b5[i] = (byte) (0xff & xorTemp);
            }
            if(isAsciiPrintable(new String(b5)))
            {
                System.out.print("Key Char:" + j + " ==> ");
                System.out.println(new String(b5));
            }
        }
    }



    public static String xorTwoHextString(String importantTextInHex, String sInHex)
    {
        byte[] importantTextInHexByteArray = DatatypeConverter.parseHexBinary(importantTextInHex);
        byte[] xorStringinHexByteArray = DatatypeConverter.parseHexBinary(sInHex);
        byte[] resutlByteArray = new byte[importantTextInHexByteArray.length];

        for (int i = 0; i < importantTextInHexByteArray.length; i++)
        {
            int xorTemp = (int)importantTextInHexByteArray[i] ^ (int)xorStringinHexByteArray[i];
            resutlByteArray[i] = (byte)(0xff & xorTemp);
        }
        return DatatypeConverter.printHexBinary(resutlByteArray);
    }

    public static boolean isAsciiPrintable(char ch) {
        return ch >= 32 && ch < 127;
    }

    public static boolean isAsciiPrintable(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (isAsciiPrintable(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static String convertStringToHex(String asciiString) {
        return asciiString.chars()
                        .mapToObj(c -> String.format("%02x", (int) c))
                        .reduce("", String::concat);
    }
}
