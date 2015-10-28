package com.design.patterns.iterator.config.callable;

import com.design.patterns.iterator.config.Code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class ConfigFactoryWithIterator extends AbstractConfigFactory {
    @Override
    public void printConfig() {
        System.out.println("# 1. loggerConfig prints....");
        Iterator loggerConfigIterator = loggerConfig.createIterator();
        printConfig(loggerConfigIterator);

        System.out.println("#2. executorConfig prints....");
        Iterator executorConfigIterator = executorConfig.createIterator();
        printConfig(executorConfigIterator, executorConfig.getConfigList());
    }

    public void printConfigUseIteratorImplements() {
        Iterator implementsIterator = loggerConfig.creaIteratorUseIteratorImplements();
        printConfig(implementsIterator);
    }

    private void printConfig(Iterator iterator) {
        while(iterator.hasNext()) {
            Code config = (Code) iterator.next();
            System.out.println(config.toString());
        }
    }

    private void printConfig(Iterator iterator, HashMap<String, Code> target) {
        while(iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println(target.get(key).toString());
        }
    }
}
