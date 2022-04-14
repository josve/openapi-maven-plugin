package com.github.kbuntrock.yaml;

import org.apache.maven.plugin.logging.Log;

public enum Logger {
    INSTANCE;

    private Log logger;

    public Log getLogger() {
        return logger;
    }

    public void setLogger(Log logger) {
        this.logger = logger;
    }
}
