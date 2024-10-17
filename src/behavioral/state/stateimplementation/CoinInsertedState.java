package behavioral.state.stateimplementation;

import behavioral.state.state.VendingMachineState;
import behavioral.state.vendingmachine.VendingMachine;

public class CoinInsertedState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount() {
        System.out.println("Can't insert amount, please select the item");
    }

    @Override
    public void selectItem(String product, Integer quantity) {
        if (vendingMachine.getInventory().containsKey(product) && vendingMachine.getInventory().get(product) >= quantity) {
            System.out.println("Dispensing item pls wait");
            vendingMachine.setState(this.vendingMachine.getDispenseItemState());
        } else {
            System.out.println("Item out of stock");
            vendingMachine.setState(this.vendingMachine.getOutOfStockState());
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item cannot be dispensed before selecting the product");
    }
}
