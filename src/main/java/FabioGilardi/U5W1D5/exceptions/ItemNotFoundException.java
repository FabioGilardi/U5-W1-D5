package FabioGilardi.U5W1D5.exceptions;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(long id) {
        super("record's id: " + id + " has not been found!");
    }
}
