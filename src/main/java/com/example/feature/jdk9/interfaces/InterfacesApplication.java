package com.example.feature.jdk9.interfaces;

/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public interface InterfacesApplication {


    private void save(){



    }


    default void insert(){
        save();
    }

}
