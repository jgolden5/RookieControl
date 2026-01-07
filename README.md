# Rookie Control
## The Vision: 
Picture this, you log onto Master Control once. It works every time. You get signed out after 24 hours of inactivity, not 30 minutes/2 hours/whatever the app feels like that day. You are INSTANTLY transferred to a SIMPLE search box with a strict document code search, a fuzzy document title search, and maybe a simple dropdown with a few other options. Then, you get a list of ACTUAL DOCUMENTS (none of that terrrible dropdown crap), and there are buttons not only for opening each as Word doc or PDF doc, but also for printing and saving said documents. With a single click, you can save the document as a Word doc, and that gets done asynchronously so you can do whatever else you wanted to do right there in Rookie Control. The documents either get opened, saved, or printed, and this process happens instantly. You can also access any document references of a document via a "doclinks" section, which can easily be viewed for any document. You don't have to be a master guru to know how to search for a document. Even rookies can search quick with Rookie Control.

# System Design

## Functional Requirements (Written in order of highest to lowest priority)
### Users should be able to...
* strict search by docuent code
* open document on device as word doc or pdf with the click of a button
* save document to device as word doc or pdf at the click of a button
* open and save document to device (should it be click of a button or 2 buttons? not sure)
* fuzzy search by document titles
* open documents from within other documents (via "doclinks")
* print document as word doc or pdf with the click of a button

## Nonfunctional Requirements
### The system should have...
* availability > consistency (AP system--prioritize Availability and Partition tolerance. Per CAP theorem, this may come at the expense of temporary data inconsistency) (note that in some cases we might still need to prioritize consistency, for example, in the event that we MUST have the most updated version of a document, but this is not a need by default)
* low-latency--document open < 1000ms if possible
* low-latency--search < 500ms if possible
* low-latency--launch < 100ms if possible
* bursts of up to 75K users during busy seasons (these can come unpredictably) [scale for reads]
* higher durability needs (data should not be lost under most circumstances, though employees often have backups saved on their computer so all is not necessarily lost)
* secure access control (if there's ANY security concerns whatsoever in any app, access control MUST be implemented)
* secure data protection (sensitive company data not intended for competitors)
* redundancy (this is likely something that was not prioritized with Master Control, hence its being extremely slow)
* failover mechanism (this is where Rookie Control has a chance to really shine. Master Control [maybe] has a valid reason for why its servers often go down, but Master Control has no failover screen! If it only had a failover system in place, the user experience could be 10X better, so Rookie Control needs to have a solid failover mechanism)
* recovery (technically, the better the redundancy, the less urgent the recovery speed, and since I'm prioritizing failover, I don't need a CRAZY speedy recovery time, or highly sophisticated recovery mechanism, but I do want a reliable one--one that will recover well. So that's what I'll shoot for with Rookie Control's recovery design)
* strict compliance to industry standards and data protection laws (HIPAA, GDPR, FDA regulations, FTC guidance, and ISO/IEC standards)

### unsure about the following
* environment contraints - unsure, would be good to dig into once the project gains more traction and I can actually consult with the engineering team

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
