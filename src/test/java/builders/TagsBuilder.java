package builders;

import entities.requests.Tags;

public class TagsBuilder {

    private Tags tags = new Tags();

    public TagsBuilder withId(int id) {
        tags.setId(id);
        return this;
    }

    public TagsBuilder withName(String name) {
        tags.setName(name);
        return this;
    }

    public Tags build(){
        return tags;
    }

}
