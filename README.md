# gauge-java-maven-selenium-modified-page-factory

This is an example project, illustrating how to do test automation using [Gauge](https://github.com/getgauge/gauge) test automation framework, with Java support.

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

