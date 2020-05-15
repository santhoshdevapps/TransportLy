# Transportly - Take home assignment
This project covers all the requirement given in the coding exercise and achieve the user stories for the Transport.ly and also handled some of the most common JSON errors

## Table of contents
* [Test approach](#test-approach)
* [Concepts Included](#concepts-included)
* [Libraries and Frameworks](#libraries-and-frameworks)
* [Requirements](#requirements)
* [Setup](#setup)
* [Screenshot](#screenshot)       
* [Note](#note)

## Test approach

The aim of this framework is to cover the user stories such as : loading a flight schedule as given in the scenario and generate flight itineraries by scheduling a batch of orders. 

I created this framework with Java, Maven and structured in a way that no data is left in the application. 

I organized the features of flight, order and cargo at "base" package, the task mentioned in user stories in a repository named "tasks" and "utils" repository consists of parser to parse the JSON and Comparator used to sort the order. The data at "testdata" package consists of orders JSON file.  At last, all the user stories can be run using Results.java file.Some of the common error handling is done in the project


## Concepts Included

* Commonly used test utility classes
* SOLID Principles

## Libraries and Frameworks
Version for some of these can be found in the POM file.

* Maven - Build and package management
* Json simple - read json

## Requirements

In order to utilize this project you need to have the following installed locally:

* MacOS
* Java 1.8
* Eclipse - IDE
* git
* Maven 


# Setup


The project is broken into separate modules for user story #1 and user story #2

* Clone the repository from git using git clone url command.
* Open the project **Transportly** in Eclipse as a maven project using pom.xml

**Java Application**

```
* From Project Explorer, navigate through PathFactoryAutomationTest and run the file "testng.xml" as TestNG Suite;
```
or
**Maven**

```
* From Project Explorer, right click and run as Maven clean
* Proceed with maven install
```

## Screenshot of Test sample output
![screenshot of the output](/screenshots/testresultssample.png)

