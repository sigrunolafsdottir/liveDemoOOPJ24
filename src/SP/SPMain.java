package SP;

public class SPMain {

    int luckyNumber=3;

    public SPMain() {
        Program p = new Program();
        p.setName("Javaprogrammet");

        Kurs k = new Kurs();
        k.setName("OOPJ");
        p.setKurs1(k);

        Lärare l = new Lärare();
        l.setName("Sigrun");

        System.out.println(luckyNumber);
    }

    public static void main(String[] args) {
        SPMain main = new SPMain();
    }


}
