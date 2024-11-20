package Sprint4.JsonDemo.Omskrivning;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TriviaCategories {

    @JsonProperty
    private List<Category> trivia_categories;

    // Getters and Setters
    public List<Category> getTriviaCategories() {
        return trivia_categories;
    }

    public void setTriviaCategories(List<Category> trivia_categories) {
        this.trivia_categories = trivia_categories;
    }

    @Override
    public String toString() {
        return "TriviaCategories{" +
                "trivia_categories=" + trivia_categories +
                '}';
    }
}

