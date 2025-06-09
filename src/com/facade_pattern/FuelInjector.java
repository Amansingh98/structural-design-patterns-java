package com.facade_pattern;

public class FuelInjector {
    public void on() {
        System.out.println("Fuel injector is ON");
    }

    public void inject() {
        System.out.println("Fuel is being injected");
    }

    public void off() {
        System.out.println("Fuel injector is OFF");
    }
}
