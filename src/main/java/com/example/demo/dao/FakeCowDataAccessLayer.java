package com.example.demo.dao;

import java.util.ArrayList;

import com.example.demo.model.Cow;

public class FakeCowDataAccessLayer implements CowDao{
	ArrayList<Cow> DB = new ArrayList<>();

	@Override
	public int insertCow(Cow cow) {
		DB.add(cow);
		return 0;
	}

}
