package Sprint1.Lektion2.ÖvnUppg3LivekodningDistans.Uppg3d;

public class Kurs {

    protected String name;
    protected Lärare lärare;


    public Kurs(String name) {
        this.name = name;
    }

    public Kurs(String name, Lärare lärare) {
        this.name = name;
        this.lärare = lärare;
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

}
