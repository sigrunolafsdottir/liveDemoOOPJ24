package Sprint1.Lektion1.Bilregister;

public class BilÄgare extends Person{

    protected boolean harKeps;

    public BilÄgare(String name, String address, int age, boolean harKeps) {
        super(name, address, age);
        this.harKeps = harKeps;
    }

    public boolean isHarKeps() {
        return harKeps;
    }

    public void setHarKeps(boolean harKeps) {
        this.harKeps = harKeps;
    }
}
