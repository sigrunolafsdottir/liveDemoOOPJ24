package Lektion1.Bilregister.PepparkakaDemo;

public class Pepparkaka extends Godsak{

    private String form;
    private boolean gräddad;

    public Pepparkaka(String form, boolean gräddad, int kaloriinnehåll) {
        super(kaloriinnehåll);
        this.form = form;
        this.gräddad=gräddad;
    }

    public void toString2(){
        System.out.println("Pepparkaka" + getKaloriinnehåll()+" "
        +form +" "+gräddad);
    }

    public void pepparkakaSpecifikMetod(){
        System.out.println("bara pepparkaka");
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public boolean isGräddad() {
        return gräddad;
    }

    public void setGräddad(boolean gräddad) {
        this.gräddad = gräddad;
    }

    @Override
    public String toString() {
        return "Pepparkaka{" +
                "form='" + form + '\'' +
                ", gräddad=" + gräddad +
                '}';
    }
}
