package com.example.feature.jdk11;

import java.io.File;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * {@link String#isBlank()}
 * {@link String#strip()}
 * {@link String#repeat(int)}
 * {@link String#stripLeading()}
 * {@link String#stripTrailing()}
 * @author zhengshijun
 * @version created on 15/04/19.
 */
public class ApiApplication {

    public static void main(String[] args) throws IOException {



        System.out.println("A\nB\nC\n".lines().count());


        System.out.println("".isBlank());

        System.out.println("*".repeat(50));

        List.of("1231231").toArray(String[]::new);


        Files.writeString(Path.of("/home/develop/temp/demo.txt"),"11222", StandardCharsets.UTF_8);

        String str = Files.readString(Path.of("/home/develop/temp/demo.txt"),StandardCharsets.UTF_8);
        System.out.println(str);






    }
}
