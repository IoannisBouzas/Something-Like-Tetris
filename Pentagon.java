//IOANNIS MPOUZAS AM:5025

public class Pentagon extends Shape {

    public Pentagon(int areaOfPentagon) {
        super(areaOfPentagon);
    }

    public double computeArea() {
        return (double) 3 / 4 * super.getArea();
    }

    public String getType() {
        return "Pentagon";
    }

}
