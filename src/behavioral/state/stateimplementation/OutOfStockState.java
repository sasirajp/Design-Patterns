package behavioral.state.stateimplementation;

import behavioral.state.state.VendingMachineState;
import behavioral.state.vendingmachine.VendingMachine;

public class OutOfStockState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount() {
        System.out.println("Cannot insert amount now");
    }

    @Override
    public void selectItem(String product, Integer quantity) {
        System.out.println("Cannot select product now");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item out of stock");
        vendingMachine.setState(this.vendingMachine.getNoCoinState());
    }
}
