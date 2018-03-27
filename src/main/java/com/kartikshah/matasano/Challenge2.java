package com.kartikshah.matasano;

import javax.xml.bind.DatatypeConverter;
import java.io.FileNotFoundException;


/**
 * Created by kartik on 12/18/15.
 */
public class Challenge2
{
    public static void main(String[] args) throws FileNotFoundException
    {

        //Challenge2
        String c1 = "1c0111001f010100061a024b53535009181c";
        String c2 = "686974207468652062756c6c277320657965";

        byte[] b1 = DatatypeConverter.parseHexBinary(c1);
        byte[] b2 = DatatypeConverter.parseHexBinary(c2);

        byte[] b3 = new byte[b1.length];

        for (int i = 0; i < b1.length; i++)
        {
            int xorTemp = (int)b1[i] ^ (int)b2[i];
            b3[i] = (byte)(0xff & xorTemp);
        }
        System.out.println(DatatypeConverter.printHexBinary(b3));
    }

}
