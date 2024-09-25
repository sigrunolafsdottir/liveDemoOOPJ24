package BilRegisterDistans;

public class Bilägare extends Person {

    private boolean harKeps;
    private String secretCode;

    public Bilägare(String name, int age, boolean harKeps) {
        super(name, age, "Hemma");
        this.harKeps = harKeps;

    }

    @Override
    public String toString() {
        return "Bilägare{" +
                "harKeps=" + harKeps +
                ", secretCode='" + secretCode + '\'' +
                ", namn='" + super.getName() + '\'' +
                '}';
    }

    public boolean isHarKeps() {
        return harKeps;
    }

    public void setHarKeps(boolean harKeps) {
        this.harKeps = harKeps;
    }
}
