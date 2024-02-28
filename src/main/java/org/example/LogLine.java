package org.example;

public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        switch (logLine.substring(logLine.indexOf('['), logLine.indexOf(']') + 1)) {
            case "[TRC]":
                return LogLevel.TRACE;
            case "[DBG]":
                return LogLevel.DEBUG;
            case "[INF]":
                return LogLevel.INFO;
            case "[WRN]":
                return LogLevel.WARNING;
            case "[FTL]":
                return LogLevel.FATAL;
            case "[ERR]":
                return LogLevel.ERROR;
            default:
                return LogLevel.UNKNOWN;
        }

    }

    public String getOutputForShortLog() {

        return getLogLevel().getNumberOfLog() + ":" + logLine.substring(logLine.indexOf(']') + 3);

    }
}
