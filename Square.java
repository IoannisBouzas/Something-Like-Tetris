//IOANNIS MPOUZAS AM:5025

public class Square extends Shape {

    public Square(int areaOfSquare) {
        super(areaOfSquare);
    }

    public double computeArea() {
        return super.getArea();
    }

    public String getType() {
        return "Square";
    }

}
