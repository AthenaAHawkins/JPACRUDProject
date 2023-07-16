package com.skilldistillery.fourteeners.data;

import java.util.List;

import com.skilldistillery.fourteeners.entities.Fourteener;

public interface FourteenerDAO {
	
	Fourteener findById(int id);
	List<Fourteener> findAll();
	List<Fourteener> findByKeyword(String name);
	Fourteener create(Fourteener mountain);
	Fourteener update(int fourteenerId, Fourteener mountain);
	boolean deleteById(int id);
	

}
