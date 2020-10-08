public class AddingMachine {
    private int total;
    private String history = "0";

    /**
     *
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Returns the total.
     * @return The running total.
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds a value to the total and updates the history.
     * @param value to be added to the total.
     */
    public void add (int value) {
        total += value;
        history += " + " + value;
    }

    /**
     * Subtracts a value from the total and updates the history.
     * @param value to be subtracted from the total.
     */
    public void subtract (int value) {
        total -= value;
        history += " - " + value;
    }

    /**
     * Prints a complete history of all operations.
     * @return history
     */
    public String toString () {
        return history;
    }

    /**
     *  Clears the AddingMachine
     */
    public void clear() {
        history = "0";
        total = 0;
    }
}