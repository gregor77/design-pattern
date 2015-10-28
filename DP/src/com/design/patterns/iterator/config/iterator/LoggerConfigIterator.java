package com.design.patterns.iterator.config.iterator;

import com.design.patterns.iterator.config.Code;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public class LoggerConfigIterator implements Iterator {

    private ArrayList<Code> loggerConfigList;
    private int index = 0;

    public LoggerConfigIterator(ArrayList<Code> loggerConfigList) {
        this.loggerConfigList = loggerConfigList;
    }

    @Override
    public boolean hasNext() {
        if (index >= loggerConfigList.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object result = null;
        if (index >= loggerConfigList.size()) {
            return result;
        }
        result = loggerConfigList.get(index);
        index++;
        return result;
    }

    @Override
    public void remove() {
        throw new IllegalStateException("Not support remove method...");
    }
}
