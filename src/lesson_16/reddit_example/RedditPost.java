package lesson_16.reddit_example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditPost {
    private String title;
    private String subreddit;

    @Override
    public String toString() {
        return "Reddit post: " + title + " subreddit: " + subreddit;
    }
}
