package com.decorator_pattern.decorators;

import com.decorator_pattern.ChristmasTree;
import com.decorator_pattern.TreeDecorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate(){
        return super.decorate() + decorateWithGarland();
    }

    public String decorateWithGarland(){
        return "with Garland ";
    }
}
