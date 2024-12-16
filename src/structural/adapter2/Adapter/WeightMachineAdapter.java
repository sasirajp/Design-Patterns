package structural.adapter2.Adapter;

import structural.adapter2.Adaptee.WeighMachine;

public class WeightMachineAdapter {

    public WeighMachine weighMachine;

    public WeightMachineAdapter(WeighMachine weighMachine) {
        this.weighMachine = weighMachine;
    }

    public Double getWeightInKG() {
        return weighMachine.getWeightInPounds() * .45;
    }

}
