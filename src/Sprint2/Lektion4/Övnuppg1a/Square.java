package Sprint2.Lektion4.Övnuppg1a;

public class Square implements IFigure {

    protected double width;
    protected double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getCircumference(){
        return width + width + height + height;
    }

}
