## Chapter 1

#### Pre-requisites
* Basic Understanding of Java, [REST API's](https://www.sitepoint.com/developers-rest-api/) and brief idea on [JSON](https://developers.squarespace.com/what-is-json/)
* Having a basic knowledge on RESTAssured Library, if not
click [here](http://rest-assured.io/)

#### Getting Started
First, let us quickly understand the following things
1. **What is DSL?**
2. **Keywords present in RESTAssured DSL**

````What is DSL?````

Domain Specific Language (DSL) DSLs are small languages, focused on a particular
aspect of a software system. You can't build a whole program with a DSL,
but you often use multiple DSLs in a system mainly written in a general purpose language.

````Keywords present in RESTAssured DSL````
1. given()
2. when()
3. body()
4. extract()

And other <b>Keywords</b> are used following to the `given|when|then|extract`. Click [here](https://github.com/rest-assured/rest-assured/wiki/usage)
to check a few more keywords.
#### Sequence of creating a Request and receiving a Response
1. `given()` - These are the configs that we can define following to the current keyword
    * QueryParameters
    * Body
    * Headers
2. `when()` - These are the following actions that can be implemented after this keyword
    * HTTP Method ( get, POST, PUT, DELETE....)
3. `then()` - Validations/Assertions need to be implemented after this keyword
4. `extract()` - To retrieve a single value from JSON

![](https://i.imgur.com/8QMTKCY.png)

**Note:** Before getting into tests, we need to add the dependencies in Gradle File. Click here to check the
[<b>Gradle Config</b>](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter01/Chapter01GradleConfig.md)

This Chapter consists of four tests
1. **Test-1:** Send a get Request of an API and validate the body
2. **Test-2:** Send a get Request of an API by passing the Query Parameters in the URL itself
3. **Test-3:** Send a get Request of an API and retrieve the data from the body
4. **Test-4:** Send a get Request of an API and store the Response

#### **Test-1:** Send a GET Request of an API and validate the body
In this test we are going to Send a Request and Validate the JSON body
1. `queryParam()` - Filter the Data with a given values
2. `get()` - HTTP Method
3. `statusCode()` - Response StatusCode
4. `body()` - To get the data from the JSON and verify it.

#### **Test-2:** Send a get Request of an API by passing the Query Parameters in the URL itself
In the above test, we have seen how to pass the query parameters separately. Now let's see how to pass it in another way
1. Not only in the `queryParameter()` section we can even pass the parameters in the URL itself.
This approach is good when we have a common `GET` method across all API's.

#### **Test-3:** Send a GET Request of an API and retrieve the data from a body
In this test, we are going to Send a Request and retrieve some data from the Response
1. `extract()` - It is used to return any value from the JSON

#### **Test-4:** Send a GET Request of an API and store the Response
Previously we have seen how to retrieve a single value. Now in this test, we are going to store entire Response
1. `Response response = given()...` - This way we can store the Response

    ![](https://i.imgur.com/t35qmpT.png)
    
2. `response.getStatusCode` - Will return the StatusCode
3. `response.getBody().asString()` - Returns entire JSON Body in a String format

#### Summary
In this Chapter, we have learned about
1. How to create and send a Request for a get API
2. How to retrieve single data from JSON body
3. How to Store the Response
