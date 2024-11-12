package Sprint4.BIlregister.Serverside;

public class Bil {

    private String regnr;
    private String color;
    private String owner;
    private String model;

    public Bil(String regnr, String color, String owner, String model) {
        this.regnr = regnr;
        this.color = color;
        this.owner = owner;
        this.model = model;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regnr='" + regnr + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
