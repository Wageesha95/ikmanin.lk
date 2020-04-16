package com.wageesha.ilk_server.DataModels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Location")
public class Location {

	@Id
	private String id;
	private String town;
	private String city;
	private String district;
	private String province;
	
	
	public Location(String id, String town, String city, String district,
					String province) {
		super();
		this.id = id;
		this.town = town;
		this.city = city;
		this.district = district;
		this.province = province;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
