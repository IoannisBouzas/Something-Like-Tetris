//IOANNIS MPOUZAS AM:5025

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Logger;

public class ShapeGenerator {

    private Circle circle;
    private Pentagon pentagon;
    private Square square;
    private Triangle triangle;
    private Random rndShapeSelectorGenerator;
    private Random rndShapeAreaGenerator;
    private ArrayList<Integer> areaOfNumbers;
    private ArrayList<Shape> arrayOfShapes;
    private int numberOfShapes;

    public ShapeGenerator(int numberOfShapes) {
        this.numberOfShapes = numberOfShapes;
        initializeShapes(numberOfShapes);

    }

    private void initializeShapes(int number) {
        arrayOfShapes = new ArrayList<Shape>(4 * number);
        areaOfNumbers = new ArrayList<Integer>();
        rndShapeSelectorGenerator = new Random();
        rndShapeAreaGenerator = new Random();
        for (int k = 0; k < 4; k++) {
            areaOfNumbers.add(k + 1);
        }
        areaOfNumbers.add(8);
        areaOfNumbers.add(12);
        areaOfNumbers.add(16);
        this.circle = new Circle(areaOfNumbers.get(rndShapeAreaGenerator.nextInt(areaOfNumbers.size())));
        this.square = new Square(areaOfNumbers.get(rndShapeAreaGenerator.nextInt(areaOfNumbers.size())));
        this.pentagon = new Pentagon(areaOfNumbers.get(rndShapeAreaGenerator.nextInt(areaOfNumbers.size())));
        this.triangle = new Triangle(areaOfNumbers.get(rndShapeAreaGenerator.nextInt(areaOfNumbers.size())));
        for (int i = 0; i < numberOfShapes; i++) {
            arrayOfShapes.add(circle);
        }
        for (int i = 0; i < numberOfShapes; i++) {
            arrayOfShapes.add(square);

        }
        for (int i = 0; i < numberOfShapes; i++) {
            arrayOfShapes.add(pentagon);
        }
        for (int i = 0; i < numberOfShapes; i++) {
            arrayOfShapes.add(triangle);
        }
        Collections.shuffle(arrayOfShapes);
    }

    public Shape nextShape() {
        int rndShape = rndShapeSelectorGenerator.nextInt(arrayOfShapes.size());
        Shape selectedShape = arrayOfShapes.get(rndShape);
        arrayOfShapes.remove(rndShape);
        return selectedShape;
    }

    public boolean hasShape() {
        return arrayOfShapes.isEmpty();
    }

    public String toString() {
        String shapesInside = "";
        System.out.print("\n");
        for (Shape shape : arrayOfShapes) {
            shapesInside += shape + "\n";
        }
        return shapesInside;
    }

    public static void main(String[] args) {
        ShapeGenerator shape = new ShapeGenerator(2);
        for (int i = 0; i < 4 * 2; i++) {
            if (!shape.hasShape()) {
                System.out.println(shape.nextShape());
                System.out.println(shape.toString());
            }
        }
    }
}
