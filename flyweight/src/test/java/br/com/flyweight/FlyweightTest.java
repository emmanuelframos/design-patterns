package br.com.flyweight;

import org.junit.Test;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FlyweightTest {

    private static int CANVAS_SIZE = 500;
    private static int TREES_TO_DRAW = 1_000_000;
    private static int TREE_TYPES = 2;

    @Test
    public void test_flyweight(){

        Forest forest = new Forest();

        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(randomPoint(CANVAS_SIZE), randomPoint(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Summer Oak texture stub");

            forest.plantTree(randomPoint(CANVAS_SIZE), randomPoint(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setAlwaysOnTop(true);
        forest.setDefaultCloseOperation(EXIT_ON_CLOSE);
        forest.repaint();
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int randomPoint(int max) {
        return (int)(Math.random() * (max + 1));
    }
}
