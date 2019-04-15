package com.example.feature.jdk9.io;

import com.google.common.io.ByteStreams;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;

/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class InputStreamApplication {

    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);


        // dsd
        try(inputStreamReader;outputStreamWriter) {


            CharBuffer charBuffer = CharBuffer.allocate(1024);
            int size = inputStreamReader.read(charBuffer);

            System.out.println(size);

            System.out.println(new String(charBuffer.array()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
