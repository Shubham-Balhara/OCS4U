package com.dao;

import java.util.List;

import com.bean.Profile;

public interface ProfileDao {
	public String addProfile(Profile p);
	public List<Profile> getAllProfile();
	public Profile getProfileById(String id);
	public String deleteProfile(Profile p);
	public String updateProfile(Profile p);
}
