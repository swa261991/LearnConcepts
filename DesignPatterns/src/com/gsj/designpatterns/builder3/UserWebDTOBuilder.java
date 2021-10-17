package com.gsj.designpatterns.builder3;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;

	public UserWebDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	public UserWebDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	public UserWebDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	public UserWebDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() +", " + address.getStreet()
					   +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
		return this;
	}

	public UserWebDTO build() {
		dto = new UserWebDTO(firstName+ " "+lastName, address, age);
		return dto;
	}

	public UserWebDTO getUserDTO() {
		return dto;
	}
	

}
