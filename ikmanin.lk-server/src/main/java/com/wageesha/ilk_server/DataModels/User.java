package com.wageesha.ilk_server.DataModels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
public class User {
	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@DBRef
	private Set<Role> roles = new HashSet<>();

	private String firstName;
	private String lastName;
	private Location userLocation;
	private String profilePicture;
	private Boolean emailVerification;
	private LocalDate accountCreatedDate;



	public User() {
	}

	public User( String firstName, String lastName,
				 Location userLocation, String profilePicture, Boolean emailVerification, LocalDate accountCreatedDate) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.userLocation = userLocation;
		this.profilePicture = profilePicture;
		this.emailVerification = emailVerification;
		this.accountCreatedDate = accountCreatedDate;
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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

	public Location getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(Location userLocation) {
		this.userLocation = userLocation;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Boolean getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(Boolean emailVerification) {
		this.emailVerification = emailVerification;
	}

	public LocalDate getAccountCreatedDate() {
		return accountCreatedDate;
	}

	public void setAccountCreatedDate(LocalDate accountCreatedDate) {
		this.accountCreatedDate = accountCreatedDate;
	}
}