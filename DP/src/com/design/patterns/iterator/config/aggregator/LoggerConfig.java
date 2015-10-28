package com.design.patterns.iterator.config.aggregator;

import com.design.patterns.iterator.config.Code;
import com.design.patterns.iterator.config.iterator.LoggerConfigIterator;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class LoggerConfig extends AbstractConfig{
    private final static String STATUS_LOGGER_CONFIG = "01";
    @Getter private ArrayList<Code> configList = new ArrayList<Code>();

    public LoggerConfig() {
        addConfig("server", "http://70.121.245.208:8080");
        addConfig("logFilePath", "C:\\log");
        addConfig("logginYn", "Y");
    }

    @Override
    protected void addConfig(String key, String value) {
        Code code1 = new Code(STATUS_LOGGER_CONFIG, key, value);
        configList.add(code1);
    }

    @Override
    public Iterator createIterator() {
        return configList.iterator();
    }

    public Iterator creaIteratorUseIteratorImplements() {
        return new LoggerConfigIterator(configList);
    }
}
