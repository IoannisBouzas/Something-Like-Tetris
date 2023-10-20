//IOANNIS MPOUZAS AM:5025

public class Triangle extends Shape {

    public Triangle(int areaOfTriangle) {
        super(areaOfTriangle);
    }

    public double computeArea() {
        return 0.5 * super.getArea();
    }

    public String getType() {
        return "Triangle";
    }

}
