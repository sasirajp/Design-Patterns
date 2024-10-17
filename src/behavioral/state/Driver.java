package behavioral.state;

import behavioral.state.vendingmachine.VendingMachine;

public class Driver {
    public static void main(String[] args) {
        var vendingMachine = new VendingMachine();
        vendingMachine.insertAmount(100);
        vendingMachine.selectProduct("Soda", 1);
        vendingMachine.dispenseProduct();

        vendingMachine.insertAmount(100);
        vendingMachine.selectProduct("Soda", 100);
        vendingMachine.dispenseProduct();



    }
}
