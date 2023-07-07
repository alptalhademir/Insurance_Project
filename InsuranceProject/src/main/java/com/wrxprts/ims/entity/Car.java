package com.wrxprts.ims.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBLCAR")
public class Car
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CarID", nullable = false)
	private Long id;
	
	private String brand;
	
	private String model;
	
	private String motorType;
	
	private Short year;
	
	private int mileage;
	
	private int carPrice;
	
	@ManyToMany(mappedBy = "cars")
	private List<User> users;
	
	public Car()
	{
		
	}
	
	public Car(String brand, String model, String motorType, Short year, int mileage, int carPrice,
			List<User> users)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.motorType = motorType;
		this.year = year;
		this.mileage = mileage;
		this.carPrice = carPrice;
		this.users = users;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getMotorType()
	{
		return motorType;
	}
	
	public void setMotorType(String motorType)
	{
		this.motorType = motorType;
	}
	
	public Short getYear()
	{
		return year;
	}
	
	public void setYear(Short year)
	{
		this.year = year;
	}
	
	public int getMileage()
	{
		return mileage;
	}
	
	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}
	
	public int getCarPrice()
	{
		return carPrice;
	}
	
	public void setCarPrice(int carPrice)
	{
		this.carPrice = carPrice;
	}
	
	public List<User> getUsers()
	{
		return users;
	}
	
	public void setUsers(List<User> users)
	{
		this.users = users;
	}
	
}
