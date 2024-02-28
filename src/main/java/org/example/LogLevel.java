package org.example;

    public enum LogLevel {
        TRACE(1), DEBUG(2), INFO(4), WARNING(5), ERROR(6), UNKNOWN(0), FATAL(42);
        private final int numberOfLog;

        LogLevel(int numberOfLog) {
            this.numberOfLog = numberOfLog;
        }

        public int getNumberOfLog() {
            return this.numberOfLog;
        }
    }
