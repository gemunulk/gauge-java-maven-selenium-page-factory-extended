# gauge-java-maven-selenium-page-factory-extended [![Build Status](https://travis-ci.org/gemunulk/gauge-java-maven-selenium-page-factory-extended.svg?branch=master)](https://travis-ci.org/gemunulk/gauge-java-maven-selenium-page-factory-extended)

This is an example project, which extends Selenium Page Factory pattern, to work with AngularJS applications.
Approach is to NOT to use @FindBy provided by Selenium. This is purely because @FindBy is very helpful for static elements (not for elements that are dynamically loaded).
In AngularJS applications, elements are not loaded instantly and Selenium needs to wait for the element to load or do a regular check for it's existence (using Expected conditions).
In that cases, @FindBy would not work and you have to use By selectors.

This project uses

- [Gauge](http://getgauge.io/)
- Gauge Java plugin
- [Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
- [Selenium](https://seleniumhq.github.io/docs/)


# Concepts covered

- Use [Webdriver](http://docs.seleniumhq.org/projects/webdriver/)
- Page Factory Pattern
- Specs

# Prerequisites

- [Install Gauge](http://getgauge.io/download.html)
- [Install Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Install Gauge-Java plugin] by running
  ````
  gauge install java
  ````

## System Under Test (SUT)

```
Using the "APP_ENDPOINT" /env/default/default.properties
```
* The SUT should be available at [http://newtours.demoaut.com](http://newtours.demoaut.com)

# Executing specs

### Set up
This project requires maven to install dependencies. To install dependencies re-import maven dependencies using IntelliJ IDEA.

### All specs
````
mvn gauge:execute -DspecsDir=specs
````
This will also compile all the supporting code implementations.

