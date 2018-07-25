package io.anirtek.persistence.relations;

import java.util.UUID;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class User {

	@Id
	private String id;

	private String firstName;
	private String lastName;

	/**
	 * Means each user will have one address entry in address table
	 */
	@OneToOne
	private Address address;

	/**
	 * One user has more than one address e.g. home, office, etc
	 */
	// @OneToMany
	// private List<Address> addresses;

	/**
	 * Many users will have one address
	 */
	// @ManyToOne
	// private Address address;

	/**
	 * Many users will have many addresses
	 */
	// @ManyToMany
	// private List<Address> addresses;

	public User() {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + "]";
	}

}
