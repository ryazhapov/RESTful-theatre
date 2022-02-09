package cinema;

public class Ticket {
    private int row;
    private int column;
    private int price;
    private boolean isPurchased;

    public Ticket(int row, int column) {
        this.row = row;
        this.column = column;
        this.price = this.row <= 4 ? 10 : 8;
        this.isPurchased = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }
}
