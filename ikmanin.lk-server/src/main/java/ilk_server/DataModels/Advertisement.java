package ilk_server.DataModels;


import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Advertisememnts")
public class Advertisement {
	
	@Id
	private String id;
	private String userId;
	private String category;
	private String description;
	private int price;
	private Location itemLocation;
	private ArrayList<String> photos;
	private ArrayList<String> tags;
	private String status;
	//@Indexed(direction = IndexDirection.ASCENDING)
	private String timestamp;
	
	
	public Advertisement(String id, String userId, String category, String description, int price,
						 Location itemLocation, ArrayList<String> photos, ArrayList<String> tags, String status, String timestamp) {
		super();
		this.id = id;
		this.userId = userId;
		this.category = category;
		this.description = description;
		this.price = price;
		this.itemLocation = itemLocation;
		this.photos = photos;
		this.tags = tags;
		this.status = status;
		this.timestamp = timestamp;
	}

	
	
	public Advertisement(String id, String userId, String category, String description, Location itemLocation, ArrayList<String> photos,
						 ArrayList<String> tags, String status, String timestamp) {
		super();
		this.id = id;
		this.userId = userId;
		this.category = category;
		this.description = description;
		this.itemLocation = itemLocation;
		this.photos = photos;
		this.tags = tags;
		this.status = status;
		this.timestamp = timestamp;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
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
}
