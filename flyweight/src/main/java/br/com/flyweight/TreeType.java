package br.com.flyweight;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String description;

    public TreeType(String name, Color color, String description) {
        this.name = name;
        this.color = color;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
