package Lektion1.Bilregister.BilRegisterDistans;

public class huvudprogram {

    int minVariabel = 56;

    public huvudprogram() {
        System.out.println(minVariabel);


        Bilägare bosse = new Bilägare("Bosse", 67, true);
        Bilägare anna = new Bilägare("Anna", 27, false);
        Bilägare cecil = new Bilägare("Cecil", 57, false);
        Bilägare ragge = new Veteranbilsägare("Ragge", 46, false, true);
        //Bilägare ragge = new Bilägare("Ragge", 46, false);

        Bil volvon = new Bil("123wer", "Volvo", "blå", bosse);
        Bil fiaten = new Bil("456rty", "Fiat", "svart", anna);
        Bil oldie = new Bil("234dfg", "Chrystler", "rosa", ragge);

        System.out.println(bosse.toString());
        System.out.println(anna.toString());
        System.out.println(cecil.toString());
        System.out.println(ragge.toString());

        System.out.println();

        System.out.println(volvon.toString());
        System.out.println(fiaten.toString());
        System.out.println(oldie.toString());
        System.out.println();

        fiaten.köp(ragge);

        System.out.println(fiaten.toString());

    }

    public static void main(String[] args) {
        huvudprogram h2;
        int i;  //stacken
        Integer i2 = 4; //heap
        huvudprogram hp = new huvudprogram();  //heapen
    }
}
