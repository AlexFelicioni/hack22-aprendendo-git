package com.orbitallpayments.hack22customers.controllers;
import com.orbitallpayments.hack22customers.domains.Customer;
import com.orbitallpayments.hack22customers.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
public class CustomerControler {
    @Autowired
    private ResponseEntity<Customer> save(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> customers = customersService.findAll();
        return ResponseEntity.ok(customers);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable long ig){
        Optional<Customer> fetchedCustomer = customerservice.findById(id);

        return ResponseEntity.ok(fetchedCustomer.get());
    }
}
