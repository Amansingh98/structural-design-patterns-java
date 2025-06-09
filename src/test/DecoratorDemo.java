package test;

import com.decorator_pattern.ChristmasTree;
import com.decorator_pattern.ChristmasTreeImpl;
import com.decorator_pattern.decorators.BubbleLights;
import com.decorator_pattern.decorators.Garland;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DecoratorDemo {

    @Test
    public void testGarlandDecoration() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1);
        assertEquals("Christmas tree with Garland", tree1.decorate());
    }

    @Test
    public void testMultipleDecorations() {
        ChristmasTree tree2 = new BubbleLights(
                new Garland(
                        new Garland(new ChristmasTreeImpl())
                )
        );
        System.out.println(tree2);
        assertEquals("Christmas tree with Garland with Garland with Bubble Lights", tree2.decorate());
    }
}
