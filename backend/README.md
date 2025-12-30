# Rookie Control: 
_Document navigation system made simple enough even for rookies to navigate (Master Control improved)_
## Generate maven wrapper
```
cd .../backend/RookieControl
mvn -N wrapper:wrapper
```

## Run from CLI
```
  ./mvnw clean package
  ./mvnw spring-boot:run

```

## Run Tests from CLI:
### a) Run all tests
```
./mvnw test
```

Runs all JUnit (or other supported) tests in src/test/java.

Reports success/failure in the console.

### b) Run a single test class
```
./mvnw -Dtest=HealthControllerTest test
```

Replace HealthControllerTest with the class name of the test you want to run.

### c) Run a single test method
```
./mvnw -Dtest=HealthControllerTest#healthEndpointReturnsOK test
```

Replace healthEndpointReturnsOK with the method name.
