package com.facade_pattern;

public class CarEngineFacade {
    private static final int DEFAULT_COOLING_TEMP = 90;
    private static final int MAX_ALLOWED_TEMP = 50;

    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();


    public void startEngine() {
        System.out.println("Starting engine...");
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();
        System.out.println("Engine started.\n");
    }


    public void stopEngine() {
        System.out.println("Stopping engine...");
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
        System.out.println("Engine stopped.\n");
    }
}
