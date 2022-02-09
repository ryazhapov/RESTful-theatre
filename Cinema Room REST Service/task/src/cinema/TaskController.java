package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {
    CinemaRoom seats = new CinemaRoom();

    @GetMapping("/seats")
    public ResponseEntity<CinemaRoom> getSeats() {
        return new ResponseEntity<>(seats, HttpStatus.OK);
    }

    @PostMapping("/purchase")
    public ResponseEntity purchaseTicket(@RequestBody int row, int column) {
        Ticket ticket = new Ticket(row, column);
        if (row > 9 || column > 9) {
            return new ResponseEntity(Map.of("error", "The number of a row or a column is out of bounds!"), HttpStatus.OK);
        }
        if (ticket.isPurchased()) {
            return new ResponseEntity(Map.of("error", "The ticket has been already purchased!"), HttpStatus.OK);
        }
        ticket.setPurchased(true);
        return new ResponseEntity(ticket, HttpStatus.OK);
    }
}
