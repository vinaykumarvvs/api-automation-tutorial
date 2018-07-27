## Chapter 2

#### Pre-requisites
* To get started with the <b>Second Chapter</b>, I recommend you to go through the [Chapter 1](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter01/Chapter01.md).
* If you are reading this line then you are good to go. Let's get started with the <b>Second Chapter</b>

#### **Before getting into the Tests**
These are the things we have done in the <b>First Chapter</b> that are not recommended. In a layman approach, we can simply say that <b>First Chapter</b> is very tightly coupled.
1. Hard-coded the `BASE_URL`
2. And if you observe, in every test we are repeating the same lines of code like `given|when|then|get..` for the same functionality.

#### **Agenda for this Chapter**
Now in this chapter, we are going to optimize the code what we have used for <b>First Chapter</b>, by doing this anyone can easily 
read and maintain the code.

#### **Optimizing**
In order to optimize the code, we have introduced the following Java Files.
1. [PropertiesReader](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/utils/PropertiesReader.java) - It is used to read the URL's from the Properties file.
2. [ResourceHelper](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/utils/ResourceHelper.java) - This Java file is used to implement all <b>HTTP Methods</b>
3. [BaseTest](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/utils/BaseTest.java) - Every test needs to extend this Java File. In this file, we can have `Hooks|CommonsMethods`

```After introducing the above files we can clearly say that our project is loosely coupled and easily maintainable```.

#### **Tests**
This Chapter consists only one test
1. **Test-1:** Abstracting the Requests for maintenance and readability

#### Summary
Things we have learned so far from [Chapter 1](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter01/Chapter01.md) 
and [Chapter 2](https://github.com/vinaykumarvvs/api-automation-tutorial/tree/master/src/test/java/Chapters/Chapter02/Chapter02.md) 
1. How to send the Request and receive the Response.
2. How to segregate the code based on their functionality by following `Single Responsibility Principle`.