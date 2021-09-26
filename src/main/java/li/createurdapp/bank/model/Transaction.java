package li.createurdapp.bank.model;

import java.time.LocalDateTime;

public record Transaction(long id, double amount, LocalDateTime date, String description) {
}
