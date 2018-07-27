## Chapter 3

#### **Pre-requisites**
* To get started with the <b>Third Chapter</b>, I recommend you to go through the [Chapter 2](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter02/Chapter02.md).
* If you are reading this line then you are good to go. Let's get started with the <b>Third Chapter</b>

#### **Quick Recap**
Here are some listings, we have learned till now
1. How to send a GET Request
2. How to validate the Response 
3. And also we have seen, How to segregate the things in order to maintain `Single Responsibility Principle`.

#### **Agenda for this Chapter**
In this chapter, we are going to create the POST Request using <b>Entity-Builder</b> pattern and validate the 
Response StatusCode. Here is the quick reference for [Why & What is Entity-Builder-Pattern](https://dzone.com/articles/the-builder-pattern-for-test-classes)

#### **Request JSON**
Here is the JSON that we are going to use for <b>Creating a Pet</b>. 
This JSON reference I have taken it from [PetStore-Swagger](http://petstore.swagger.io/).

![](https://imgur.com/FPIphmp.png)

#### **Create Entities and Builders** 
In the above JSON, we have seen some couple of Objects. So lets create the 
Java files for the above mentioned JSON. Here is the references to the JAVA files
1. [Category](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/requests/Category.java) & [CategoryBuilder](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/builders/CategoryBuilder.java)
2. [Tags](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/requests/Tags.java) & [TagsBuilder](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/builders/TagsBuilder.java)
3. [CreatePetRequest](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/requests/CreatePetRequest.java) & [CreatePetRequestBuilder](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/builders/CreatePetRequestBuilder.java)

#### **Gradle Config**
Before getting into the tests we need to add the following dependency in `build.gradle`
1. `compile group: 'org.codehaus.jackson', name: 'jackson-mapper-asl', version: '1.8.5'` - This library is used to convert the Java 
object into a String. Your final dependency block should look like

![](https://i.imgur.com/5TxF64T.png)

#### **Introducing RequestHelper**
* [RequestHelper](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/utils/RequestHelper.java) - helps us to convert the Java object into a String. 
It takes input as an object and returns the String.

#### **Tests**
This Chapter consists only one test
1. **Test-1:** Creating the POST Request and validating the Response Code

   In this test, we are doing the following actions:<br/>
   
   a. Create an object for <b>Category</b> with some data <br/>
   b. Create an object for <b>Tags</b> with some data and inserting in the TagsList<br/>
   c. Now create a main object <b>CreatePetRequest</b><br/>
   d. Then serialize the object into JSON String and sending it in the body<br/>
   e. Validate the Response Status-Code<br/>
   
#### **Summary**
Things we have learned so far:
1. How to send the GET Request and receive the Response.
2. How to segregate the code based on their functionality by following `Single Responsibility Principle`.
3. How to create and send the POST Request using `Entity-Builder` pattern.