package com.design.patterns.iterator.config.callable;

import com.design.patterns.iterator.config.aggregator.ExecutorConfig;
import com.design.patterns.iterator.config.aggregator.LoggerConfig;

/**
 * Created by bookboogie on 2015. 10. 18..
 */
public abstract class AbstractConfigFactory {
    protected LoggerConfig loggerConfig;
    protected ExecutorConfig executorConfig;

    public AbstractConfigFactory() {
        loggerConfig = getLoggerConfigInstance();
        executorConfig = getExecutorConfigInstance();
    }

    private LoggerConfig getLoggerConfigInstance() {
        if (loggerConfig == null) {
            loggerConfig = new LoggerConfig();
        }
        return loggerConfig;
    }

    private ExecutorConfig getExecutorConfigInstance() {
        if (executorConfig == null) {
            executorConfig = new ExecutorConfig();
        }
        return executorConfig;
    }

    abstract public void printConfig();
}
