package com.kartikshah.matasano;

import javax.xml.bind.DatatypeConverter;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kartik on 12/18/15.
 */
public class Challenge5
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Challenge 5
        String importantText = "Burning 'em, if you ain't quick and nimble" + System.lineSeparator() + "I go crazy when I hear a cymbal";
        String importantTextInHex = Utils.convertStringToHex(importantText);

        String key = Stream.generate(() -> String.valueOf("ICE"))
                .limit(importantText.length())
                .collect(Collectors.joining())
                .substring(0,importantText.length());

        String sInHex = Utils.convertStringToHex(key);
        String result = Utils.xorTwoHextString(importantTextInHex, sInHex);
        System.out.println(result);
    }
}
