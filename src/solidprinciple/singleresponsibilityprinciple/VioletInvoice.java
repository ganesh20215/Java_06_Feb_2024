package solidprinciple.singleresponsibilityprinciple;

public class VioletInvoice {
    private Marker marker;
    private int quantity;

    public VioletInvoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return marker.price * this.quantity;
    }

    public void printInvoice() {
        // printing implementation
    }

    public void saveToDb() {
        // save to database implementation
    }
}
