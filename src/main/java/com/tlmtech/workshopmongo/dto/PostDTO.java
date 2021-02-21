package com.tlmtech.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import com.tlmtech.workshopmongo.domain.Post;

public class PostDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id; 
	private Date date;
	private String title;  
	private String body;
	
	public PostDTO() {
		
	} 
		
	public PostDTO(Post obj) {
		this.id = id; 
		this.date = date; 
		this.title = title; 
		this.body = body; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
