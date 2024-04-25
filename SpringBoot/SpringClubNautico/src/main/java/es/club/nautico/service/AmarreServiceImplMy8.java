package es.club.nautico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.club.nautico.entities.*;
import es.club.nautico.repository.*;

@Service
public class AmarreServiceImplMy8  implements AmarreService{
	@Autowired
	private AmarreRepository arepo;
	
	@Override
	public Amarre findById(int idAmarre) {
		// TODO Auto-generated method stub
		return arepo.findById(idAmarre).orElse(null);
	}

	@Override
	public Amarre updateOne(Amarre amarre) {
		// TODO Auto-generated method stub
		try {
			return arepo.save(amarre);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Amarre insertOne(Amarre amarre) {
		// TODO Auto-generated method stub
		try{
			return arepo.save(amarre);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int deleteOne(int idAmarre) {
		// TODO Auto-generated method stub
		Amarre amarre = arepo.findById(idAmarre).orElse(null);
		try {
			arepo.delete(amarre);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public List<Amarre> findAll() {
		// TODO Auto-generated method stub
		return arepo.findAll();
	}
}
