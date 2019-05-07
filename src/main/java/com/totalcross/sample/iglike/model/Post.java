package com.totalcross.sample.iglike.model;

import totalcross.ui.image.Image;

public class Post {

	private String text;

	private Image photo;

	private Image profilePic;

	private String profileName;

	private String minutesAgo;

	private String location;

	private int likes;

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Image getPhoto() {
		return photo;
	}

	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	public Image getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Image profilePic) {
		this.profilePic = profilePic;
	}

	public String getMinutesAgo() {
		return minutesAgo;
	}

	public void setMinutesAgo(String minutesAgo) {
		this.minutesAgo = minutesAgo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
