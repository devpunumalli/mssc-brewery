package guru.springframwwork.msscbrewery.web.controller;

import guru.springframwwork.msscbrewery.services.CustomerService;
import guru.springframwwork.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomerDto> getById(@PathVariable(name = "id") UUID id){
return new ResponseEntity<>(customerService.getId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertCustomer(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto insertedDto=customerService.insertCustomer(customerDto);
        HttpHeaders headers=new HttpHeaders();
        headers.add("location","/api/v1/customer/"+insertedDto.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity updateCustomer(@PathVariable(name = "customerId") UUID customerId, @Valid @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId,customerDto);
      return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    public ResponseEntity deleteCustomer(@PathVariable(name = "customerId") UUID customerId)
    {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
