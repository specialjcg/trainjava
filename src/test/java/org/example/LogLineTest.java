package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogLineTest {
    @Test
    @Tag("task:1")
    @DisplayName("Parsing log level TRC")
    public void getLogLevelTrace() {
        var logLine = new LogLine("[TRC]: Line 84 - System.out.println(\"Hello World\");");
        assertEquals(LogLevel.TRACE, logLine.getLogLevel());

    }
    @Test
    @Tag("task:3")
    @DisplayName("Get short log output for log level TRACE")
    public void getShortLogOutputTrace() {
        var logLine = new LogLine("[TRC]: You know the rules and so do I");
        assertEquals("1:You know the rules and so do I", logLine.getOutputForShortLog());
    }
}