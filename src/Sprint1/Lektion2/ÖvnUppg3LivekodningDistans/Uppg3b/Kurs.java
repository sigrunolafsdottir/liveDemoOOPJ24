package Sprint1.Lektion2.ÖvnUppg3LivekodningDistans.Uppg3b;

import java.util.List;

public class Kurs {

    protected String name;
    protected Lärare lärare;
    protected List<Student> students;

    public Kurs(String name) {
        this.name = name;
    }

    public Kurs(String name, Lärare lärare, List<Student> students) {
        this.name = name;
        this.lärare = lärare;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
