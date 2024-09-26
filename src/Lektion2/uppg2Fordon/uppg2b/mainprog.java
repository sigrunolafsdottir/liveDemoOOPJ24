package Lektion2.uppg2Fordon.uppg2b;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mainprog {

    public mainprog(){
        Bil b = new Bil(56, 1234, 4, 2);
        Tåg t = new Tåg(65, 6777, 5);
        Fordon f = new Tåg(98, 76554, 7);
        Fordon f2 = new Bil(87, 999, 4, 2);

        List<Fordon> lista = new LinkedList<>();
        lista.add(f);
        lista.add(f2);
        lista.add(b);
        lista.add(t);

        List<Fordon> lista2 = Arrays.asList(f, f2, b, t);

        for(Fordon e : lista){
            e.printMe();
        }

        System.out.println();

        for(Fordon e : lista2){
            e.printMe();
        }

 /*
        b.printMe();
        t.printMe();

        f.printMe();
        f2.printMe();

  */
    }

    public static void main(String[] args) {
        mainprog m = new mainprog();
    }
}
