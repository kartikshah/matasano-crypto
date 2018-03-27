package com.kartikshah.matasano;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.util.Base64;

/**
 * Created by kartik on 12/18/15.
 */
public class Challenge1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Challenge1
        String hexString = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
        byte[] hexByteArray = DatatypeConverter.parseHexBinary(hexString);
        System.out.println(Base64.getEncoder().encodeToString(hexByteArray));

    }


}
