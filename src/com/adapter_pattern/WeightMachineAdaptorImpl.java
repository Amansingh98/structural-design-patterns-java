package com.adapter_pattern;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{
    WeightMachine machine;

    public WeightMachineAdaptorImpl(WeightMachine machine) {
        this.machine = machine;
    }

    public int getWeightInKg() {
        int weightInPound = machine.getWeightInPounds();
        return (int) (weightInPound * .45);
    }
}
