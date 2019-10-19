package com.promineotech.finalProjectApi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.promineotech.finalProjectApi.entity.Address;
import com.promineotech.finalProjectApi.entity.Order;
import com.promineotech.finalProjectApi.util.SustainabilityProceeds;

@Entity
public class Customer {

	
	private Long id;
	private String firstName;
	private String lastName;
	private Address address;
	private Set<CustomerReview> reviews;
	
	private Set<Order> orders;
	
	private SustainabilityProceeds proceeds;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@OneToMany(mappedBy = "customer")
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	@OneToMany(mappedBy = "customer")
	public Set<CustomerReview> getReviews() {
		return reviews;
	}
	public void setReviews(Set<CustomerReview> reviews) {
		this.reviews = reviews;
	}
	public SustainabilityProceeds getProceeds() {
		return proceeds;
	}
	public void setProceeds(SustainabilityProceeds proceeds) {
		this.proceeds = proceeds;
	}
}
