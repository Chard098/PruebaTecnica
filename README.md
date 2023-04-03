# Prueba Tecnica
Dependencies:
Java 11 & Maven
---
## To Run UI/E2E Test Execution as Maven project from IDE
1. Create Run configuration:

    a) Select Maven template;

    b) put under Working Directory path to : pruebaTecnica;
    
    c) put under Command line:  "`mvn clean test -Dbrowser=chrome`";


2. Select save configuration and click `Run` button 
---

## To Run UI/E2E Test Execution from Terminal
```
mvn clean test -Dbrowser=chrome
```
---
## Structure
```
Test files are in src/test/java/, 
basePackage, this package contains a java class that have all methods for POM pages.
dataProvider, this package contaions the ConfigFileReader, also the configuration file is located inside the package resources.
page Object Package, contains the POM for the different pages utilize between the tests. In these classes you define the steps in order to execute the test.
```

