package com.example.feature.jdk10;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;


/**
 *  {@link java.util.Set#copyOf}
 *  {@link java.util.OptionalDouble#orElseThrow()}
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

        Set.copyOf(List.of());

      
    }
}
