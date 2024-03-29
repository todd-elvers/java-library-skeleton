import ch.qos.logback.classic.encoder.PatternLayoutEncoder

statusListener(NopStatusListener)

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss} [%-5level] %logger{0}:%L - %msg%n"
    }
}

root(WARN, ["CONSOLE"])