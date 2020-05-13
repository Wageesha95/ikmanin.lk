package com.wageesha.ilk_server.DataModels;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Document(collection="Advertisements")
public class Advertisement {

	@Id
	private String id;
	private String userId;
	private String category;
	private String bio;
	private int price;
	private Location itemLocation;
	private ArrayList<String> photos;
	private ArrayList<String> tags;
	private String condition;
	private String brand;
	private String model;
	private Integer modelYear;
	private Integer engineCapacity;
	private Integer mileage;
	private Boolean negotiability;
	private String description;
	private String contactName;
	private String phoneNumber;
	private Boolean status;
	private LocalDateTime createdTimestamp;
	private LocalDateTime lastUpdatedTimestamp;

	public Advertisement() {

	}

	public Advertisement(String userId, String category, String bio, int price, Location itemLocation,
						 ArrayList<String> photos, ArrayList<String> tags, String condition, String brand,
						 String model, Integer modelYear, Integer engineCapacity, Integer mileage,
						 Boolean negotiability, String description, String contactName, String phoneNumber, Boolean status,
						 LocalDateTime createdTimestamp, LocalDateTime lastUpdatedTimestamp) {
		this.userId = userId;
		this.category = category;
		this.bio = bio;
		this.price = price;
		this.itemLocation = itemLocation;
		this.photos = photos;
		this.tags = tags;
		this.condition = condition;
		this.brand = brand;
		this.model = model;
		this.modelYear = modelYear;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.negotiability = negotiability;
		this.description = description;
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.lastUpdatedTimestamp=lastUpdatedTimestamp;
	}

	public Advertisement(String userId, String category, String bio, int price, Location itemLocation,
						 ArrayList<String> photos, ArrayList<String> tags, String condition, String brand,
						 String model, Integer modelYear, Integer engineCapacity, Integer mileage,
						 Boolean negotiability, String description, String contactName, String phoneNumber, Boolean status,
						 LocalDateTime createdTimestamp) {
		this.userId = userId;
		this.category = category;
		this.bio = bio;
		this.price = price;
		this.itemLocation = itemLocation;
		this.photos = photos;
		this.tags = tags;
		this.condition = condition;
		this.brand = brand;
		this.model = model;
		this.modelYear = modelYear;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.negotiability = negotiability;
		this.description = description;
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUser(String userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Location getItemLocation() {
		return itemLocation;
	}

	public void setItemLocation(Location itemLocation) {
		this.itemLocation = itemLocation;
	}

	public ArrayList<String> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<String> photos) {
		this.photos = photos;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	public Integer getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Boolean getNegotiability() {
		return negotiability;
	}

	public void setNegotiability(Boolean negotiability) {
		this.negotiability = negotiability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public LocalDateTime getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
}


