package Sprint1.Lektion2.uppg2Fordon.uppg2c;

public class mainprog {

    public static void main(String[] args) {
        //Fordon f = new Fordon();

        Bil b = new Bil(56, 1234, 4, 2);
        Tåg t = new Tåg(65, 6777, 5);
        Fordon f = new Tåg(98, 76554, 7);
        Fordon f2 = new Bil(87, 999, 4, 2);

        b.printMe();
        t.printMe();

        f.printMe();
        f2.printMe();

    }
}
