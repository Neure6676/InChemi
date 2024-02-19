package org.threeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeam.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}
