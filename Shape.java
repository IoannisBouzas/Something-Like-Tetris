//IOANNIS MPOUZAS AM:5025

public abstract class Shape {

    private int boundingRectangle;

    public Shape(int area) {
        this.boundingRectangle = area;
    }

    public abstract double computeArea();

    public abstract String getType();

    public boolean sameArea(Shape other) {
        return this.computeArea() == other.computeArea();
    }

    public boolean sameType(Shape other) {
        System.out.println("Bouzas");
        return other.getType() == this.getType();
    }

    public String toString() {
        return this.getType() + ":" + this.computeArea();
    }

    public int getArea() {
        return this.boundingRectangle;
    }

}