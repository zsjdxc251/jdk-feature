package com.example.feature.jdk9;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class CollectionApplication {


    public static void main(String[] args) {

        Map<String, String> map = Map.of("name", "zsj");

        System.out.println(JSON.toJSONString(map));


        Set<String> set = Set.of("1");

        List<String> list = List.of("2");

        List<String> listArray = new ArrayList<>() {
        };


        Set<String> hashSet = new HashSet<>(){
            //匿名实现类重写add方法。
            @Override
            public boolean add(String s) {
                System.out.println("执行add方法");
                return super.add(s);
            }
        };
        hashSet.add("1");


    }
}
