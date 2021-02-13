package com.example.demo.model;

import java.util.UUID;

public class Cow {
	
	private String name;
	private int tag;
	private UUID id;
	
	public Cow(String name,int tag) {
		this.name = name;
		this.tag = tag;
		this.id = UUID.randomUUID();
	}
	
	public String getName() {
		return name;
	}
	
	public int getTag() {
		return tag;
	}
	
	public UUID getID() {
		return id;
	}
	
	

}
