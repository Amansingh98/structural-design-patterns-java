package com.decorator_pattern.decorators;

import com.decorator_pattern.ChristmasTree;
import com.decorator_pattern.TreeDecorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return "with Bubble Lights";
    }
}
