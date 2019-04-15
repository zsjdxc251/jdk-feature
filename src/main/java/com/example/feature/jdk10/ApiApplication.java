package com.example.feature.jdk10;


/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class ApiApplication {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
//        System.out.println(version.feature());
//        System.out.println(version.update());
//        System.out.println(version.interim());
        System.out.println(version);


    }
}
