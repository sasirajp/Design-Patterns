package behavioral.state.state;

//class which holds the current state
public interface VendingMachineState {
     void insertAmount();
     void selectItem(String product, Integer quantity);
     void dispenseItem();
}
