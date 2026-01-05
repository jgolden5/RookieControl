# Rookie Control
## The Vision: 
Picture this, you log onto Master Control once. It works every time. You get signed out after 24 hours of inactivity, not 30 minutes/2 hours/whatever the app feels like that day. You are INSTANTLY transferred to a SIMPLE search box with a strict document code search, a fuzzy document title search, and maybe a simple dropdown with a few other options. Then, you get a list of ACTUAL DOCUMENTS (none of that terrrible dropdown crap), and there are buttons not only for opening each as Word doc or PDF doc, but also for printing and saving said documents. With a single click, you can save the document as a Word doc, and that gets done asynchronously so you can do whatever else you wanted to do right there in Rookie Control. The documents either get opened, saved, or printed, and this process happens instantly. You can also access any document references of a document via a "doclinks" section, which can easily be viewed for any document. You don't have to be a master guru to know how to search for a document. Even rookies can search quick with Rookie Control.

# Launching the Backend via Spring Boot:
_The easiest way to launch is through IntelliJ Idea or similar IDE, but for more control, see command line usage below_

# Prerequisites to run:
* JDK
* Maven
* Spring Boot
* Docker (and Docker Desktop app for non-Linux systems)

# Recommended
* IntelliJ IDEA
* Vim (cause it's > VSCode)

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

### Coming soon to docs: Docker (specifically docker compose), RookieControlAPI, and front end
