package guru.springframwwork.msscbrewery.services;

import guru.springframwwork.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

   public  CustomerDto getId(UUID id);

    void deleteCustomer(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto insertCustomer(CustomerDto customerDto);
}
