package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DoctorEntity;
import com.example.demo.interfaces.FeignInterface;
@RestController
@RequestMapping("/feign")
public class FeignController {
	@Autowired
	FeignInterface finterface;
	
	@GetMapping("/get")
	public List<DoctorEntity> gt(){
		return finterface.getall();
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?>gtt(@PathVariable Long id){
		return finterface.get(id);
	}
@PostMapping("/create")
public ResponseEntity<?>create(@RequestBody DoctorEntity doctorentity){
	return finterface.create(doctorentity);
}
}
