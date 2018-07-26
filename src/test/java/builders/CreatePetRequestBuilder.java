package builders;

import entities.requests.Category;
import entities.requests.CreatePetRequest;
import entities.requests.Tags;

public class CreatePetRequestBuilder {

    private CreatePetRequest createPetRequest = new CreatePetRequest();

    public CreatePetRequestBuilder withTags(Tags[] tags){
        createPetRequest.setTags(tags);
        return this;
    }

    public CreatePetRequestBuilder withCategory(Category category){
        createPetRequest.setCategory(category);
        return this;
    }

    public CreatePetRequestBuilder withId(int id){
        createPetRequest.setId(id);
        return this;
    }

    public CreatePetRequestBuilder withStatus(String status){
        createPetRequest.setStatus(status);
        return this;
    }

    public CreatePetRequestBuilder withName(String name){
        createPetRequest.setName(name);
        return this;
    }

    public CreatePetRequestBuilder withPhotoUrls(String[] photoUrls){
        createPetRequest.setPhotoUrls(photoUrls);
        return this;
    }

    public CreatePetRequest build(){
        return createPetRequest;
    }

}
