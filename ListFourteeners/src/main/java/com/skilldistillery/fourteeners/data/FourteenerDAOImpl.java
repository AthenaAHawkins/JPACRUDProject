package com.skilldistillery.fourteeners.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.fourteeners.entities.Fourteener;

@Service
@Transactional
public class FourteenerDAOImpl implements FourteenerDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Fourteener findById(int id) {
		return em.find(Fourteener.class, id);
	}

	@Override
	public List<Fourteener> findAll() {
		String jpql = "SELECT mountain FROM Fourteener mountain";
		return em.createQuery(jpql, Fourteener.class).getResultList();
	}

	@Override
	public Fourteener create(Fourteener mountain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fourteener update(int fourteenerId, Fourteener mountain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
