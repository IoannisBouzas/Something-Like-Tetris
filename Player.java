//IOANNIS MPOUZAS AM:5025

import java.util.*;

public class Player {

    private Deque<Shape> playerShapes;
    private double points;
    private int sizeOfDeque;

    public Player(int size) {
        this.sizeOfDeque = size;
        this.playerShapes = new ArrayDeque<Shape>(sizeOfDeque);
    }

    public void playShape(Shape shape) {
        System.out.println("Incoming Shape " + shape);
        System.out.println("Do you want to accept it?(Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("Y")) {
            int exampleNumber = 0;
            playerShapes.addFirst(shape);
            System.out.println("Shape Accepted");
            exampleNumber++;
            if (exampleNumber > 1) {
                if (shape.sameType(playerShapes.peekFirst())) {
                    System.out.println("Two shapes were gone");
                    int number = 0;
                    do {
                        playerShapes.remove();
                        number++;
                    } while (number < 2);
                    System.out.println("Two shapes were gone");
                } else if (shape.computeArea() == playerShapes.getFirst().computeArea()) {
                    this.points += shape.computeArea() * 10;
                    System.out.println("Added " + this.points + " points");
                } else {
                    this.points += shape.computeArea();
                    System.out.println("Added " + this.points + " points");
                }
            } else {
                this.points += shape.computeArea();
                System.out.println("Added " + this.points + " points");
            }
        }
    }

    public boolean isStackFull() {
        return playerShapes.isEmpty();
    }

    public void printStack() {
        System.out.println("Current Stack: ");
        int a = 1;
        for (Shape shape : playerShapes) {
            System.out.println("    " + a + ":" + shape);
            a++;
        }
    }

    public double getPoints() {
        return this.points;
    }
}