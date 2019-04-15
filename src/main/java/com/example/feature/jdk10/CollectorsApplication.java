package com.example.feature.jdk10;

import java.util.stream.Collectors;

/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class CollectorsApplication {


    public static void main(String[] args) {
        Collectors.toUnmodifiableList();

        Collectors.toUnmodifiableMap((key)->{
            return "";
        },(value)->{
            return "";
        });

        Collectors.toUnmodifiableSet();
    }
}
