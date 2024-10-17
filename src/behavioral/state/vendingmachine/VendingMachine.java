package behavioral.state.vendingmachine;

import behavioral.state.state.VendingMachineState;
import behavioral.state.stateimplementation.CoinInsertedState;
import behavioral.state.stateimplementation.DispenseItemState;
import behavioral.state.stateimplementation.NoCoinState;
import behavioral.state.stateimplementation.OutOfStockState;

import java.util.HashMap;
import java.util.Map;

//Context
public class VendingMachine {

    private VendingMachineState currentState;
    private final Map<String, Integer> inventory;

    private NoCoinState noCoinState;
    private CoinInsertedState coinInsertedState;
    private OutOfStockState outOfStockState;
    private DispenseItemState dispenseItemState;


    public VendingMachine() {
        this.noCoinState = new NoCoinState(this);
        this.coinInsertedState = new CoinInsertedState(this);
        this.outOfStockState = new OutOfStockState(this);
        this.dispenseItemState = new DispenseItemState(this);
        this.currentState = this.noCoinState;
        inventory = new HashMap<>();
        inventory.put("Soda", 10);
        inventory.put("Coke", 5);
        inventory.put("Lays", 7);
        inventory.put("Yoga Bar", 5);
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public void insertAmount(Integer amount) {
        this.currentState.insertAmount();
    }

    public void selectProduct(String product, Integer quantity) {
        this.currentState.selectItem(product, quantity);
    }

    public void dispenseProduct() {
        currentState.dispenseItem();
    }

    public NoCoinState getNoCoinState() {
        return noCoinState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public OutOfStockState getOutOfStockState() {
        return outOfStockState;
    }

    public DispenseItemState getDispenseItemState() {
        return dispenseItemState;
    }
}
