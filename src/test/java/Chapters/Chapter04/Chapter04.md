## Chapter 4

#### **Pre-requisites**
* To get started with the <b>Fourth Chapter</b>, I recommend you to go through the [Chapter 3](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter03/Chapter03.md).
* If you are reading this line then you are good to go. Let's get started with the <b>Fourth Chapter</b>

#### **Quick Recap**
Here are some listing, we have learned till now
1. How to send a GET Request
2. How to validate the Response 
3. How to segregate the things in order to maintain `Single Responsibility Principle`.
4. And also, How to send the POST Request using Entity-Builder pattern and validate the Response Code.

#### **Agenda for this Chapter**
Till now we know how to send a POST Request and validate only the Response Code, Do you think is this sufficient?. 
Don't worry in this chapter we are going to validate the Response body as well. So let's get started.

#### **Response JSON**
Here is the Response JSON, this JSON will be output when we POST the Request to server.

![](https://i.imgur.com/hQ0WTZB.png) 

#### **Create Entities**
1. As we have seen the Response JSON in the above picture, we can clearly observe that in Response JSON also 
we have three Objects `Category, Tags & Main Object`. These objects are very similar to the one which we have created 
for the POST method.
2. We can use the same one, but this approach is not recommended. Because if someday Request changes and Response is not changed 
then at that time it will be difficult to map the Java Object to JSON String or vice-versa.
3. So, now we are going to create only entities for [Category](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/responses/Category.java), 
[Tags](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/responses/Tags.java) & 
[CreatePetResponse](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/entities/responses/CreatePetResponse.java). 
( Here we can have any name for the Main Object, but for the inner objects we need use the same name )

#### **Introducing Response Helper**
So, in the previous chapter we have seen <b>How to convert the Java Object to a JSON String using RequestHelper</b>, now 
we are introducing <b>[ResponseHelper](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/utils/ResponseHelper.java)</b> 
to convert the String into a Java object.

#### **Tests**
This Chapter consists only one test
1. **Test-1:** Creating the POST Request and validating the RequestBody & ResponseBody

   In this test, we are doing the following actions:<br/>
   
   a. Create an object for <b>Category</b> with some data <br/>
   b. Create an object for <b>Tags</b> with some data and inserting in the TagsList<br/>
   c. Now create a main object <b>CreatePetRequest</b><br/>
   d. Then serialize the object into JSON String and sending it in the body<br/>
   e. Once we receive the Response, with the help of <b>ResponseHelper</b> we can de-serialize JSON String to Java Object<br/> 
   f. Verify the attributes from <b>RequestBody</b> & <b>ResponseBody</b>
   
#### **Summary**
Things we have learned so far:  
1. How to send the GET Request and receive the Response.
2. How to segregate the code based on their functionality by following `Single Responsibility Principle`.
3. How to create and send the POST Request using `Entity-Builder` pattern.
4. How to verify the RequestBody & ResponseBody