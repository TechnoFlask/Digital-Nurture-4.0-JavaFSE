package DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
     private Map<String, Customer> db = new HashMap<>();

     public CustomerRepositoryImpl() {
          db.put("C101", new Customer("C101", "Alice"));
          db.put("C102", new Customer("C102", "Bob"));
     }

     @Override
     public Customer findCustomerById(String id) {
          return db.get(id);
     }
}
