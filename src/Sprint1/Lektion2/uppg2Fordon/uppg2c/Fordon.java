package Sprint1.Lektion2.uppg2Fordon.uppg2c;



abstract public class Fordon {

    protected int hastghet;
    protected int vikt;

    public Fordon(int hastghet, int vikt) {
        this.hastghet = hastghet;
        this.vikt = vikt;
    }

    public Fordon(){}

    public int getHastghet() {
        return hastghet;
    }

    public void setHastghet(int hastghet) {
        this.hastghet = hastghet;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public void ändraHastighet(int nyHastighet){
        this.hastghet = nyHastighet;
    }

    @Override
    public String toString() {
        return "Fordon{" +
                "hastghet=" + hastghet +
                ", vikt=" + vikt +
                '}';
    }

    public abstract void printMe();
}
