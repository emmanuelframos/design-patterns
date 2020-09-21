package br.com.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees;

    public Forest(){
        this.trees = new LinkedList<>();
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (Tree tree : trees)
            tree.draw(graphics);
    }
}