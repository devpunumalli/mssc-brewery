package guru.springframwwork.msscbrewery.services;

import guru.springframwwork.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getId(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Devendra").build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
       log.debug("customer is deleted");
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("customer is updated");
    }

    @Override
    public CustomerDto insertCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("devendra").build();
    }
}
