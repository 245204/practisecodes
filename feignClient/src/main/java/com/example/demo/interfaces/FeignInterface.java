package com.example.demo.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.DoctorEntity;

@FeignClient(value="feignClient" , url="http://localhost:8080/doctor")
public interface FeignInterface {
	
	@RequestMapping(method=RequestMethod.GET,value="/get")
	public List<DoctorEntity>getall();
	
	@RequestMapping(method=RequestMethod.GET,value="/get/{id}")
	public ResponseEntity<?>get(@PathVariable Long id);
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public ResponseEntity<?>create(@RequestBody DoctorEntity doctorentity);

}
