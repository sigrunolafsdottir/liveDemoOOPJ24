package Lektion2.HusDemo;

public class Hus implements HusKravSpec {

    String färg;

    public Hus(String färg) {
        this.färg = färg;
    }

    @Override
    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public void printMe(){
        System.out.println(FärgInterface);

    }
}
