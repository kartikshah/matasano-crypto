package com.kartikshah.matasano;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kartik on 12/18/15.
 */
public class Challenge3
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Challenge 3
        String hexString1 = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
        Utils.singleCharacterXORdecoder(hexString1);

    }
}
