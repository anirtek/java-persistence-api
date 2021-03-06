package io.anirtek.persistence.simple;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e ORDER BY e.firstName"),
		@NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e where e.email=:pEmail") })
public class Employee {

	@Id
	private String id;

	private String firstName;
	private String lastName;

	@Column(columnDefinition = "VARCHAR(100)", unique = true)
	private String email;

	private String city;

	public Employee() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", email = " + email
				+ ", city = " + city + "]";
	}

}
