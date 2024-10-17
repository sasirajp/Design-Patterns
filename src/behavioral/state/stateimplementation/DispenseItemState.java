package behavioral.state.stateimplementation;

import behavioral.state.state.VendingMachineState;
import behavioral.state.vendingmachine.VendingMachine;

public class DispenseItemState implements VendingMachineState  {
    private VendingMachine vendingMachine;

    public DispenseItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertAmount() {
        System.out.println("Cannot insert the amount, after selecting the product");
    }

    @Override
    public void selectItem(String product, Integer quantity) {
        System.out.println("cannot select item now");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item Dispensed");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}
