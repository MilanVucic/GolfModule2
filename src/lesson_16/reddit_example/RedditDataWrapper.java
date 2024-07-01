package lesson_16.reddit_example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditDataWrapper {
    @JsonProperty("children")
    private List<RedditPostWrapper> postWrapperList;

    public List<RedditPostWrapper> getPostWrapperList() {
        return postWrapperList;
    }
}
