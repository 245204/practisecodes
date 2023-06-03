package com.example.demo.entity;


public class DoctorEntity {
	private Long id;
	private String name;
	
	 public DoctorEntity() {
			// TODO Auto-generated constructor stub
		}
	 
	public DoctorEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
