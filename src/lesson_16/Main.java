package lesson_16;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lesson_16.reddit_example.RedditPostWrapper;
import lesson_16.reddit_example.RedditResponse;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new JsonMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            URL url = new URL("https://www.reddit.com/.json");
            RedditResponse response = objectMapper.readValue(url, RedditResponse.class);
            for (RedditPostWrapper postWrapper : response.getData().getPostWrapperList()) {
                System.out.println(postWrapper.getData().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void serializeWithJackson() {
        Person p = new Person("Milan", 25, 288);
        ObjectMapper objectMapper = new JsonMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            System.out.println(objectMapper.writer().writeValueAsString(p));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePersonToFile(Person p) {
        try {
            FileOutputStream fout = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Person readPersonFromFile() {
        try {
            FileInputStream fout = new FileInputStream("example.ser");
            ObjectInputStream oos = new ObjectInputStream(fout);
            return (Person) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
