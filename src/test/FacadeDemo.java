package test;

import com.facade_pattern.CarEngineFacade;
import org.junit.Test;

public class FacadeDemo {

    @Test
    public void testCarEngine(){
        CarEngineFacade engine = new CarEngineFacade();
        engine.startEngine();
        engine.stopEngine();
    }
}
