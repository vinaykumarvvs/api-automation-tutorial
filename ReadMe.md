## API Automation Tutorial

In this tutorial you are going to learn <b>How to Automate the API Tests</b> using <b>RESTAssured Library</b>

This project contains automated api tests explained step by step. The tech stack used for this project are:
1. **JAVA** as the programming language for writing test code
2. **TestNg** as framework
3. **Gradle** as the build tool
4. **IntelliJ** as the preferred IDE for writing java code.

#### Getting Started
Setup your machine.
1. Install JDK 1.8
2. Install IntelliJ (Community edition is fine)
3. Install gradle

#### Cloning & Importing the Project
1. Clone the project from ```git clone https://github.com/vinaykumarvvs/api-automation-tutorial.git```
2. Import the project (api-automation-tutorial) in IntelliJ ```File -> New -> Project from Existing Sources -> Browse Project Location -> build.gradle```
3. Now click on ```auto import -> Ok``` wait until the IntelliJ downloads all the dependencies

#### Running tests
1. You can run the tests directly from the IntelliJ, by right clicking and **Run test**..
2. For Linux/Mac users: ```gradle clean build runTests``` (command-line)
3. For Windows users: ```gradlew clean build runTests``` (command-line)

---

### Tutorial Begins

#### [Chapter 1](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter01)
1. **Test-1:** Send a GET Request of an API and validate the body
2. **Test-2:** Send a GET Request of an API and retrieve the data from body
3. **Test-3:** Send a GET Request of an API and store the Response
