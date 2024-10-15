package Sprint2.Lektion4.ÖvnUppg2Uppdelad;

import javax.swing.*;

public class Huvudprogram {

    double mätarställningNu;
    double mätarställningDå;
    double förbrukadBensin;

    CalculationUtil cu = new CalculationUtil();
    PrintUtil pu = new PrintUtil();


    public Huvudprogram() {

        mätarställningNu = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning nu: ").trim());
        mätarställningDå = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning då: ").trim());
        förbrukadBensin = Double.parseDouble(JOptionPane.showInputDialog("Förbrukad Bensin: ").trim());

        double deltaMileage = cu.getDeltaMileage(mätarställningNu, mätarställningDå);
        double bensinPerMil = cu.getGasPerMile(förbrukadBensin, deltaMileage);

        System.out.println(pu.getPrintOutAntalKördaMil(deltaMileage));
        System.out.println(pu.getPrintOutAntalLiterBensin(förbrukadBensin));
        System.out.println(pu.getPrintOutFörbrukningPerMil(bensinPerMil));
    }

    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
    }
}
