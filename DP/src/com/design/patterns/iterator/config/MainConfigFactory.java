package com.design.patterns.iterator.config;

import com.design.patterns.iterator.config.callable.ConfigFactoryWithIterator;
import com.design.patterns.iterator.config.callable.ConfigFactoryWithoutPattern;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class MainConfigFactory {
    public static void main(String[] args) {
        System.out.println("@@@@ No Design Pattern ... @@@");
        ConfigFactoryWithoutPattern configFactoryWithoutPattern = new ConfigFactoryWithoutPattern();
        configFactoryWithoutPattern.printConfig();

        System.out.println();

        System.out.println("#### Iterator Pattern ... ####");
        ConfigFactoryWithIterator configFactoryWithIterator = new ConfigFactoryWithIterator();
        configFactoryWithIterator.printConfig();

        System.out.println();
        System.out.println("***** Use Iterator Interface ... *****");
        configFactoryWithIterator.printConfigUseIteratorImplements();
    }
}
