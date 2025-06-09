package test;

import com.adapter_pattern.WeightMachineAdaptor;
import com.adapter_pattern.WeightMachineAdaptorImpl;
import com.adapter_pattern.WeightMachineImpl;
import org.junit.Test;

public class AdaptorDemo {
    @Test
    public void weightAdaptorTest(){
        WeightMachineAdaptor machineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        int weightInKg = machineAdaptor.getWeightInKg();
        System.out.println(weightInKg);
    }
}
