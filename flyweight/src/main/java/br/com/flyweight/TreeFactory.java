package br.com.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String description) {
        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color, description);
            treeTypes.put(name, result);
        }

        return result;
    }
}