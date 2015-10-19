package com.design.patterns.iterator.config.aggregator;

import com.design.patterns.iterator.config.Code;
import com.design.patterns.iterator.config.iterator.LoggerConfigIterator;
import lombok.Getter;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class ExecutorConfig extends AbstractConfig {
    private final static String STATUS_EXECUTOR_CONFIG = "02";
    @Getter private HashMap<String, Code> configList = new HashMap<String, Code>();

    public ExecutorConfig() {
        addConfig("resultFilePath", "C:\\result");
        addConfig("excludeClass", "com.design.patterns.sample.Test");
        addConfig("loggingYn", "N");
    }

    @Override
    protected void addConfig(String key, String value) {
        configList.put(key, new Code(STATUS_EXECUTOR_CONFIG, key, value));
    }

    @Override
    public Iterator createIterator() {
        return configList.keySet().iterator();
    }
}
