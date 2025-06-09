package com.flyweight_pattern;

import java.awt.*;

public class Car implements Vehicle{

    private Engine engine; // Intrinsic state (shared)
    private Color color; // Extrinsic state (passed during usage)

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
