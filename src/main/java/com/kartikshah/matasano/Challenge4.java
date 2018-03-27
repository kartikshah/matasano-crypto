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
public class Challenge4
{
    public static void main(String[] args) throws FileNotFoundException
    {

        //Challenge 4
        BufferedReader reader = new BufferedReader(new FileReader("/Users/kartik/dev/code/matasano-crypto/src/main/java/com/kartikshah/matasano/4.txt"));

        try
        {
            int i = 0;
            for (String hextString2 = reader.readLine(); hextString2 != null; hextString2 = reader.readLine()){
                Utils.singleCharacterXORdecoder(hextString2);
                i++;
            }
            System.out.println("Total Count is : " + i);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
