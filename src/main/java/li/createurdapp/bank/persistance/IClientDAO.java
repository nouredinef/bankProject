package li.createurdapp.bank.persistance;

import li.createurdapp.bank.model.Customer;

import java.util.List;

public interface IClientDAO {

    // CRUD = Create, Read, Update, Delete

    public Customer getCustomer(long id);

    public List<Customer> getAllCustomers();

    public Customer updateCustomer(long id, Customer newCustomer);

    public void createCustomer(Customer customer);

    public void deleteCustomer(long id);


}
