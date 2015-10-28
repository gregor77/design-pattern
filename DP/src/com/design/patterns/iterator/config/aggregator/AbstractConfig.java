package com.design.patterns.iterator.config.aggregator;

import java.util.Iterator;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public abstract class AbstractConfig {
    abstract protected void addConfig(String key, String value);
    abstract public Iterator createIterator();
}
