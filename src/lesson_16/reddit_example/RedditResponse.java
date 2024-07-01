package lesson_16.reddit_example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditResponse {
    private String kind;
    private RedditDataWrapper data;

    public String getKind() {
        return kind;
    }

    public RedditDataWrapper getData() {
        return data;
    }
}
