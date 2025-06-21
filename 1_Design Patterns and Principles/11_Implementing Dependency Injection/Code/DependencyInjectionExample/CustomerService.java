package DependencyInjectionExample;

public class CustomerService {
     private final CustomerRepository repository;

     public CustomerService(CustomerRepository repository) {
          this.repository = repository;
     }

     public void showCustomerDetails(String id) {
          Customer customer = repository.findCustomerById(id);
          if (customer != null) {
               System.out.println("Customer Found: " + customer.getName());
          } else {
               System.out.println("Customer not found for ID: " + id);
          }
     }
}
