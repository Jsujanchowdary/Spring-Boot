package com.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanagement.entity.customer;


@Repository
public interface customerRepository extends JpaRepository<customer,Integer>  {

}
