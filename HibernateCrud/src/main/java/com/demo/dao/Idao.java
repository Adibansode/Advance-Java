package com.demo.dao;

import java.util.List;

import com.demo.model.User;

public interface Idao {

	void save(User u1);

	List<User> FindAll();

	boolean DeletByID(int id);

	User findbyid(int uid);

	boolean changebyid(int id1, String nm, String str);

	List<User> sortbyid();


}
