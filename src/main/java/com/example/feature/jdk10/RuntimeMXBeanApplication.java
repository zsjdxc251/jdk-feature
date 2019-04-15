package com.example.feature.jdk10;

import java.lang.management.RuntimeMXBean;

/**
 *
 * {@link RuntimeMXBean#getPid()}
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class RuntimeMXBeanApplication {

    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean;

        System.out.println(ProcessHandle.current().pid());
    }
}
