package com.skilldistillery.fourteeners.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
	public List<Fourteener> findByKeyword(String name) {
		   String jpql = "SELECT mountain FROM Fourteener mountain WHERE UPPER(mountain.name) LIKE :name";
		    return em.createQuery(jpql, Fourteener.class)
		             .setParameter("name", "%" + name.toUpperCase() + "%")
		             .getResultList();
		}

	@Override
	public Fourteener create(Fourteener mountain) {
		em.persist(mountain);
		return mountain;
	}

	@Override
	public Fourteener update(int Id, Fourteener mountain) {
		Fourteener managed = em.find(Fourteener.class, Id);
		managed.setName(mountain.getName());
		managed.setAltitude(mountain.getAltitude());
		managed.setMountainRange(mountain.getMountainRange());
		managed.setParkForest(mountain.getParkForest());
		managed.setNumOfRoutes(mountain.getNumOfRoutes());
		managed.setStandardDifficulty(mountain.getStandardDifficulty());
		managed.setStandardDistance(mountain.getStandardDistance());
		managed.setStandardElevGain(mountain.getStandardElevGain());
		
		return managed;
	}

	@Override
	public boolean deleteById(int id) {
		Fourteener beGoneWithYe = em.find(Fourteener.class, id);
		if(beGoneWithYe == null) {
			return false;
		}
		boolean success = false;
		
		em.remove(beGoneWithYe);
		
		if(! em.contains(beGoneWithYe)) {
			success = true;
		}
		return success;
	}
	
	
	

}
