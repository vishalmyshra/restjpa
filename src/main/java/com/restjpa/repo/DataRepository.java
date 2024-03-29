package com.restjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restjpa.model.CloudVendor;

public interface DataRepository extends JpaRepository<CloudVendor,String>{

}
