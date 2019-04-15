package com.example.feature.jdk10;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 *
 * {@link URLEncoder#encode(java.lang.String, java.nio.charset.Charset)}
 *
 * {@link URLDecoder#decode(java.lang.String, java.nio.charset.Charset)}
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class URLApplication {

    public static void main(String[] args) {

        String str = URLDecoder.decode("http://", StandardCharsets.UTF_8);

        System.out.println(str);


    }
}
