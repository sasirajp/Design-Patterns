package behavioral.state.stateimplementation;

import behavioral.state.state.VendingMachineState;
import behavioral.state.vendingmachine.VendingMachine;

public class NoCoinState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount() {
        System.out.println("Amount Inserted");
        vendingMachine.setState(this.vendingMachine.getCoinInsertedState());
    }

    @Override
    public void selectItem(String product, Integer quantity) {
        System.out.println("Insert Amount before selecting the product");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item cannot be dispensed without selecting the item");
    }
}
