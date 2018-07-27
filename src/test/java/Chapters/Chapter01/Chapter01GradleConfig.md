## Gradle Configuration

``Gradle is a build tool used to manage all the dependencies``

#### Add the following Dependencies in `build.gradle`
1. `testCompile group: 'org.testng', name: 'testng', version: '6.14.3'` - For TestNG
2. `testCompile 'io.rest-assured:rest-assured:3.0.6'` - This is to get all RESTAssured libraries
3. `testCompile group: 'org.hamcrest', name: 'java-hamcrest', version: '2.0.0.0'` - To get predefined assertions

After adding the dependencies your block should look like

![](https://i.imgur.com/8IsMIdQ.png)

#### Create a task for running tests from the command line
* Add the following lines of code in your `build.gradle` file
* This will make you execute all the tests present in the project from command line with `@Test` Annotation.

![](https://i.imgur.com/OPxH4hv.png)

#### Now, the Gradle file should be:

![](https://i.imgur.com/LvkwUPW.png)