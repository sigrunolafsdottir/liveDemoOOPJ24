package Sprint4.JsonDemo.AntonsOrginalKlasser;

import java.util.Objects;

public final class TriviaCategory {
    private final Integer id;
    private final String name;

    public TriviaCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer id() {
        return id;
    }

    public String name() {
        return name;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TriviaCategory) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "TriviaCategory[" +
                "id=" + id + ", " +
                "name=" + name + ']';
    }

}
