package com.rainbow.stiqer_test.entity;

public class UserPost {
	private String userName;
	private String image;
	private String headPortrait;
	private String storeDistance;
	private String like;
	private String postText;
	private String comment;
	public String getUserName() {
		return userName;
	}
	public String getStoreDistance() {
		return storeDistance;
	}
	public void setStoreDistance(String storeDistance) {
		this.storeDistance = storeDistance;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
