package Chapters.Chapter05;

import builders.CategoryBuilder;
import builders.CreatePetRequestBuilder;
import builders.TagsBuilder;
import entities.requests.Category;
import entities.requests.CreatePetRequest;
import entities.requests.Tags;
import entities.responses.CreatePetResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.RequestHelper;
import utils.ResourceHelper;
import utils.ResponseHelper;

import java.io.IOException;

public class FifthChapterTests extends BaseTest {

    @Test
    public void chainingRequestsAndValidatingTheResponse() throws IOException {

        // Creating the Category Object
        Category category = new CategoryBuilder()
                .withId(1)
                .withName("Cats")
                .build();

        // Creating the Tags Object
        Tags tags = new TagsBuilder()
                .withId(1)
                .withName("Tag 1")
                .build();

        // Inserting the above created Tags object in the TagsList, because main object accepts as an array
        Tags[] tagsList = new Tags[1];
        tagsList[0] = tags;

        // Creating the Main Object - CreatePetRequest
        String[] photoUrls = {"Photo Url"}; // Create an array with some URL's
        CreatePetRequest createPetRequest = new CreatePetRequestBuilder()
                .withCategory(category)
                .withTags(tagsList)
                .withPhotoUrls(photoUrls)
                .withId(get3DigitRandomInt()) // This `get3DigitRandomInt()` will generate the random 3 digit number, coming from BaseTest
                .withName("Testing + " + get3DigitRandomInt())
                .withStatus("available")
                .build();

        // Sending a Request
        String url = propertiesReader.getEndPointUrl("create_pet"); // Fetching url from Properties file
        String json = RequestHelper.getJsonString(createPetRequest); // Convert above created object into a String
        Response response = ResourceHelper.create(url, json);

        // Binding Response body to the Java Object
        CreatePetResponse createPetResponse = (CreatePetResponse)
                ResponseHelper.getResponseAsObject(response.asString(), CreatePetResponse.class);

        // Validating the Response Code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Validating the RequestBody & ResponseBody
        Assert.assertEquals(createPetRequest.getName(), createPetResponse.getName());
        Assert.assertEquals(createPetRequest.getStatus(), createPetResponse.getStatus());
        Assert.assertEquals(createPetRequest.getTags()[0].getName(), createPetResponse.getTags()[0].getName());

        // Verifying the Created Pet using GET Method
        String url1 = propertiesReader.getEndPointUrl("get_animal_based_on_pet_id") + createPetRequest.getId();// Concatenating the EndPoint & PetId
        Response findSpecificPetResponse = ResourceHelper.get(url1);

        // Binding Response body to the Java Object
        CreatePetResponse getPetResponseBasedOnId = (CreatePetResponse)
                ResponseHelper.getResponseAsObject(findSpecificPetResponse.asString(), CreatePetResponse.class);

        Assert.assertEquals(findSpecificPetResponse.getStatusCode(), 200);
        Assert.assertEquals(createPetRequest.getId(), getPetResponseBasedOnId.getId());
        Assert.assertEquals(createPetRequest.getName(), getPetResponseBasedOnId.getName());
    }
}
