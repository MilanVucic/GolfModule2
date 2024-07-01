package lesson_16.reddit_example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditPostWrapper {
    private RedditPost data;

    public RedditPost getData() {
        return data;
    }
}
