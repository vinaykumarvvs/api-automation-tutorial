## Chapter 1

#### Prerequisites
* Basic Understanding of REST API's & CRUD Operations
* Having a basic knowledge on RESTAssured Library, if not
click [here](http://rest-assured.io/)

This Chapter consists three tests
1. **Test-1:** Send a GET Request of an API and validate the body
2. **Test-2:** Send a GET Request of an API and retrieve the data from body
3. **Test-3:** Send a GET Request of an API and store the Response

#### Getting Started
First let us quickly understand the following things
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
to check the few more keywords.
#### Sequence of creating a Request and receiving a Response
1. `given()` - These are the configs that we can define following to the current keyword
    * QueryParameters
    * Body
    * Headers
2. `when()` - These are the following actions that can be implemented after this keyword
    * HTTP Method ( GET, POST, PUT, DELETE....)
3. `then()` - Validations/Assertions need to be implemented after this keyword
4. `extract()` - To retrieve a single value from JSON

![](https://i.imgur.com/8QMTKCY.png)

#### **Test-1:** Send a GET Request of an API and validate the body
In this test we are going to Send a Request and Validate the JSON body
1. `queryParam()` - Filter the Data with a given values
2. `get()` - HTTP Method
3. `statusCode()` - Response StatusCode
4. `body()` - To get the data from the JSON and verify it.

#### **Test-2:** Send a GET Request of an API and retrieve the data from body
In this test we are going to Send a Request and retrieve some data from the Response
1. `extract()` - It is used to return any value from the JSON

#### **Test-3:** Send a GET Request of an API and store the Response
Previously we have seen how to retrieve a single value. Now in this test we are going to store entire Response
1. `Response response = given()...` - This way we can store the Response
2. `response.getStatusCode` - Will return the StatusCode
3. `response.getBody().asString()` - Returns entire JSON Body in a String format

#### Summary
In this Chapter we have learnt about
1. How to create and send a Request for GET API
2. How to retrieve single data from JSON body
3. How to Store the Response