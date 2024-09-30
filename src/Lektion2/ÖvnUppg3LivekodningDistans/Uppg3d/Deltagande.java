package Lektion2.ÖvnUppg3LivekodningDistans.Uppg3d;

public class Deltagande {

    protected Student s;
    protected Kurs k;

    public Deltagande(Student s, Kurs k) {
        this.s = s;
        this.k = k;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Kurs getK() {
        return k;
    }

    public void setK(Kurs k) {
        this.k = k;
    }
}
