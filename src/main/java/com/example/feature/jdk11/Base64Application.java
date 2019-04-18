package com.example.feature.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

/**
 * @author zhengshijun
 * @version created on 2019/4/18.
 */
public class Base64Application {


    public static void main(String[] args) throws IOException {

        byte[] bytes = Files.readAllBytes(Paths.get("/home/develop/Downloads/jdk-8u201-linux-x64.tar.gz"));
        long startTime = System.nanoTime();



        Base64.getEncoder().encodeToString(bytes);

        long endTime = System.nanoTime();

        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));





    }
}
