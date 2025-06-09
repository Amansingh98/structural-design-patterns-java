package com.facade_pattern;

public class CoolingController {
    public void setTemperatureUpperLimit(int temp) {
        System.out.println("Cooling system upper temperature limit set to: " + temp + "°C");
    }

    public void run() {
        System.out.println("Cooling system is running");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cooling engine to below " + maxAllowedTemp + "°C");
    }

    public void stop() {
        System.out.println("Cooling system stopped");
    }
}
