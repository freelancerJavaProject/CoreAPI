package com.plot.CoreAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plot.CoreAPI.entity.BuyerRegistration;

@Repository
public interface BuyerRepository extends JpaRepository<BuyerRegistration, Integer> {

}
