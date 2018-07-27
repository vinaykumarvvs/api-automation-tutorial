## Chapter 5

#### **Pre-requisites**
* To get started with the <b>Fourth Chapter</b>, I recommend you to go through the [Chapter 4](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter04/Chapter04.md).
* If you are reading this line then you are good to go. Let's get started with the <b>Fifth Chapter</b>

#### **Quick Recap**
Here are some listing, we have learned till now
1. How to send a GET Request
2. How to validate the Response 
3. How to segregate the things in order to maintain `Single Responsibility Principle`.
4. How to send the POST Request using Entity-Builder pattern and validate the Response Code.
5. And also, How to validate RequestBody & ResponseBody

#### **Agenda for this Chapter**
* Till now we have seen how to send a Request and receive the Response, and their validations. Now we are going to see 
<b>How to Chain the API's</b>. What is Chaining? It is a process where we can pass the information from one HTTP Request to other HTTP Requests.

#### **Tests**
This Chapter consists only one test
1. **Test-1:** Chaining Requests and validate Response Body

   In this test, we are doing the following actions:<br/>
   <b>POST Request</b><br/>           
  a. Create an object for <b>Category</b> with some data <br/>
  b. Create an object for <b>Tags</b> with some data and inserting in the TagsList<br/>
  c. Now create a main object <b>CreatePetRequest</b><br/>
  d. Then serialize the object into JSON String and sending it in the body<br/>
  e. Once we receive the Response, with the help of <b>ResponseHelper</b> we can de-serialize JSON String to Java Object<br/> 
  f. Verify the attributes from <b>RequestBody</b> & <b>ResponseBody</b> 
   
   <b>GET Request</b><br/>
   g. Creating a GET Request using the PetId and verifying the other data
   
```Similarly, we can chain the HTTP Requests with other methods as well. Like POST -> GET -> PUT -> DELETE ..```

#### **Summary**
Things we have learned so far:
1. How to send the GET Request and receive the Response.
2. How to segregate the code based on their functionality by following `Single Responsibility Principle`.
3. How to create and send the POST Request using `Entity-Builder` pattern.
4. How to verify the RequestBody & ResponseBody
5. How to chain the API's