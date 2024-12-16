package structural.adapter2.client;

import structural.adapter2.Adaptee.WeighMachine;
import structural.adapter2.Adaptee.WeighMachineForKids;
import structural.adapter2.Adapter.WeightMachineAdapter;

public class Driver {

    public static void main(String[] args) {
        WeighMachine weighMachine = new WeighMachineForKids();

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapter(weighMachine);
        System.out.println(weightMachineAdapter.getWeightInKG());
    }
}
