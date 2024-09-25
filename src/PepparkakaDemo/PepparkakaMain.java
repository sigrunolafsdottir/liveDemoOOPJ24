package PepparkakaDemo;

public class PepparkakaMain {

    public PepparkakaMain() {

        Godsak g = new Godsak(45);
        Pepparkaka p1 = new Pepparkaka("gubbe", true, 65);
        //Pepparkaka p2 = new Godsak(65);  NEJ
        Godsak g2 = new Pepparkaka("gris", false, 87);
        Object g3 = new Pepparkaka("gris", false, 87);

        g.toString2();
        p1.toString2();
        g2.toString2();
        System.out.println(g3.toString());

    }

    public static void main(String[] args) {
        PepparkakaMain pm = new PepparkakaMain();
    }
}
