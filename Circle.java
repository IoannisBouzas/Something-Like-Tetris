//IOANNIS MPOUZAS AM:5025

import java.lang.*;

public class Circle extends Shape {

    public Circle(int areaOfCircle) {
        super(areaOfCircle);
    }

    public double computeArea() {
        return (Math.PI / 4) * super.getArea();
    }

    public String getType() {
        return "Circle";
    }

}
