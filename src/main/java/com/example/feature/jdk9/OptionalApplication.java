package com.example.feature.jdk9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * {@link Optional} 主要是新增了三个方法：stream，ifPresentOrElse 和 or
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class OptionalApplication {

    public static void main(String[] args) {
        List<String> list = List.of("1","2");
        Optional<List<String>> optional = Optional.of(list).or(()->{
            return Optional.of(List.of("4","5"));
        });

        Stream< List<String>> stream = optional.stream();

        System.out.println(stream.findFirst().get().get(0));
    }
}
