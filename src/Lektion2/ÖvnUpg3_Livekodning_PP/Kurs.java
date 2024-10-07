package Lektion2.ÖvnUpg3_Livekodning_PP;

import java.util.ArrayList;
import java.util.List;

public class Kurs {

    protected String name;
    protected Lärare lärare;
    protected List<Student> studenter = new ArrayList<>();

    public Kurs(String name, Lärare lärare, List<Student> studenter) {
        this.name = name;
        this.lärare = lärare;
        this.studenter = studenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public List<Student> getStudenter() {
        return studenter;
    }

    public void setStudenter(List<Student> studenter) {
        this.studenter = studenter;
    }
}
