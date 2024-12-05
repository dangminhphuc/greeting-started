package com.dangminhphuc.started.patterns.structural.flyweight.forest;

import com.dangminhphuc.started.patterns.structural.flyweight.trees.Tree;
import com.dangminhphuc.started.patterns.structural.flyweight.trees.TreeFactory;
import com.dangminhphuc.started.patterns.structural.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
