package com.orbitallpayments.hack22customers.services;
import com.orbitallpayments.hack22customers.domains.Customer;
import com.orbitallpayments.hack22customers.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> findAll() {
//        return (List<Customer>) customerRepository.findAll();
//        List<Customer> customers = new ArrayList<>();
//        for(Customer customer : (List<Customer>) customerRepository.findAll()) {
//            customers.add(customer);
//        }
//        return customers;
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers :: add);
        return customers;
    }
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }
}