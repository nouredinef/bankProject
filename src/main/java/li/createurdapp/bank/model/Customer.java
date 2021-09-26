package li.createurdapp.bank.model;

import java.util.List;

public record Customer(long id, String name, String lastName, List<Account> accounts) {
}
