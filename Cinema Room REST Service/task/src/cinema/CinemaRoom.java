package cinema;

import java.util.ArrayList;

public class CinemaRoom {
    private final int total_rows = 9;
    private final int total_columns = 9;

    private ArrayList<Seat> available_seats = new ArrayList<>();

    public CinemaRoom() {
        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_columns; j++) {
                available_seats.add(new Seat(i, j));
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public ArrayList<Seat> getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(ArrayList<Seat> available_seats) {
        this.available_seats = available_seats;
    }
}
