package test;

import com.bridge_pattern.Red;
import com.bridge_pattern.Shape;
import com.bridge_pattern.Square;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeDemo {
    @Test
    public void whenBridgePatternInvoked(){
        Shape square = new Square(new Red());
        assertEquals(square.draw(), "Square drawn. Color is Red");
    }
}
