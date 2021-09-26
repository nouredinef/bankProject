package li.createurdapp.bank.model;

import java.util.List;

public record Account(long id, Bank bank, List<Transaction> transactions, double balance, List<String> tags) {
}
