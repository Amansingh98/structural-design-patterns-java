package com.flyweight_pattern;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    public static Vehicle createVehicle(Color color){
        return vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine engine = new Engine(); //shared intrinsic state
            return new Car(engine, newColor); //extrinsic color passed
        });
    }
}
