package test;

import com.flyweight_pattern.Vehicle;
import com.flyweight_pattern.VehicleFactory;
import org.junit.Test;

import java.awt.*;

public class FlyweightDemo {

    @Test
    public void flyweightPatternTest(){
        Vehicle redCar1 = VehicleFactory.createVehicle(Color.RED);
        redCar1.start();

        Vehicle redCar2 = VehicleFactory.createVehicle(Color.RED);
        redCar2.stop();

        Vehicle blueCar = VehicleFactory.createVehicle(Color.BLUE);
        blueCar.start();

        System.out.println("redCar1 == redCar2: " + (redCar1 == redCar2)); // true: shared object
        System.out.println("redCar1 == blueCar: " + (redCar1 == blueCar)); // false: different color

    }
}
