package com.wageesha.ilk_server.DataModels;

public class Location {


	private String town;
	private String city;
	private String district;

	public Location(){

	}


	public Location( String town, String city, String district) {
		super();
		this.town = town;
		this.city = city;
		this.district = district;
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

}
