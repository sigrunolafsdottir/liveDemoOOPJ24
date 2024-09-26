package Lektion2.uppg2Fordon.uppg2c;


public class Tåg extends Fordon {

    protected int antalVagnar;

    public Tåg(int hastghet, int vikt, int antalVagnar) {
        this.hastghet = hastghet;
        this.vikt = vikt;
        this.antalVagnar = antalVagnar;
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public void läggaTillVagn(int antalVagnarAttLäggaTill){
        antalVagnar += antalVagnarAttLäggaTill;
    }

    @Override
    public String toString() {
        return "Tåg{" +
                "antalVagnar=" + antalVagnar +
                '}';
    }

    @Override
    public void printMe() {
        System.out.println("Jag är ett tåg " );
    }
}
