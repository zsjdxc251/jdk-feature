package com.example.feature.jdk9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class StreamApplication {

    public static void main(String[] args) {

        Flow.Publisher<String> publisher;

        Flow.Processor<String, String> processor;

        Flow.Subscriber<String> subscriber;




        List<Integer> list = Arrays.asList(45,43,76,87,42,77,90,73,67,88);
        //list.stream().takeWhile((x) -> x < 80 ).forEach(System.out::println);



        list.stream().dropWhile((x) -> x < 80 ).forEach(System.out::println);


        Stream.iterate(1,(x) -> x <= 10, (x) -> x + 1).forEach(System.out::print);
    }
}
