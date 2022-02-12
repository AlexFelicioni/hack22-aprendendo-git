package com.orbitallpayments.hack22customers.repositories;

import com.orbitallpayments.hack22customers.domains.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}