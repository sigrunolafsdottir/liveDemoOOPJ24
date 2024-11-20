package Sprint4.JsonDemo.AntonsOrginalKlasser;

import java.util.List;
import java.util.Objects;

public final class CategoryList {
    private final List<TriviaCategory> trivia_categories;

    public CategoryList(List<TriviaCategory> trivia_categories) {
        this.trivia_categories = trivia_categories;
    }

    public List<TriviaCategory> trivia_categories() {
        return trivia_categories;
    }

    public List<TriviaCategory> getTrivia_categories() {
        return trivia_categories;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CategoryList) obj;
        return Objects.equals(this.trivia_categories, that.trivia_categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trivia_categories);
    }

    @Override
    public String toString() {
        return "CategoryList[" +
                "trivia_categories=" + trivia_categories + ']';
    }

}
