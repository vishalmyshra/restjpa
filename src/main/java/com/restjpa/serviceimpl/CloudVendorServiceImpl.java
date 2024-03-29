package com.restjpa.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.restjpa.model.CloudVendor;
import com.restjpa.repo.DataRepository;
import com.restjpa.service.CloudVendorService;

public class CloudVendorServiceImpl implements CloudVendorService {

	@Autowired
	DataRepository dataRepository;
	
	@Override
	public Boolean createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		dataRepository.save(cloudVendor);
		return true ;
	}

	
}
