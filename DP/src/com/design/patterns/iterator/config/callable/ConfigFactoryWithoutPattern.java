package com.design.patterns.iterator.config.callable;

import com.design.patterns.iterator.config.Code;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class ConfigFactoryWithoutPattern extends AbstractConfigFactory {
    @Override
    public void printConfig() {
        ArrayList<Code> loggerConfigList = loggerConfig.getConfigList();
        System.out.println("@ 1. loggerConfig prints....");
        for (Code loggerConfig : loggerConfigList) {
            System.out.println(loggerConfig.toString());
        }

        HashMap<String, Code> executorConfigMap = executorConfig.getConfigList();
        System.out.println("@ 2. executorConfig prints....");
        for (String key : executorConfigMap.keySet()) {
            System.out.println(executorConfigMap.get(key).toString());
        }
    }
}
