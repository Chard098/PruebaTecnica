# Prueba Tecnica
This project uses WebDriverManager so you dont need to add the webdriver executor path.

## Installation / Run test

In order to execute the test, you need to use this command:

```bash
mvn clean test -Dbrowser=chrome
```

## Structure
```
Test files are in src/test/java/, 
basePackage, this package contains a java class that have all methods for POM pages.
dataProvider, this package contaions the ConfigFileReader, also the configuration file is located inside the package resources.
page Object Package, contains the POM for the different pages utilize between the tests. In these classes you define the steps in order to execute the test.
```

