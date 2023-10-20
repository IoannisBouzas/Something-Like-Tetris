//IOANNIS MPOUZAS AM:5025

import java.util.*;

public class ShapeGame {

    public static void main(String[] args) {
        System.out.println("Give the number of shapes per type");
        Scanner scanner = new Scanner(System.in);
        int numberOfShapes = scanner.nextInt();
        System.out.println("Give the size of the stack for the player");
        int size = scanner.nextInt();
        Player player = new Player(size);
        ShapeGenerator shapeGenerator = new ShapeGenerator(numberOfShapes);
        while (player.isStackFull() || !shapeGenerator.hasShape()) {
            System.out.println();
            player.printStack();
            System.out.println();
            player.playShape(shapeGenerator.nextShape());
            System.out.println("Player has get " + player.getPoints() + " points");
        }
        System.out.println("Game Over!");
    }
}
