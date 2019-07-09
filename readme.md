java-library-skeleton
---------------------------------

Skeleton for creating Java libraries that are tested w/ Spock.


<br/>


### Tech. Stack
- Java 8+ for sources
- Spock for tests (Groovy 2.5+)
- Gradle for build tool & dependency management
- Git for version control


### Configuration

- Testing
    - Unit tests live under `/src/test/groovy`
    - Integration tests live under `/src/integration/groovy`
- Logging
    - Slf4j facade for source
    - Logback impl. for tests
- Gradle
    - Added plugin which adds `:dependencyUpdates` task that will print the latest versions of all dependencies to console
    - Any tests that fails when run from the command line now output their full Spock expression for quicker debugging
    - Added `integration` configuration to confine all integration test dependencies
    - Ensures Gradle 5's new POM support is enabled by default (`implementation` vs `compile`, etc.)