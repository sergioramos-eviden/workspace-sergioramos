package es.club.nautico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.club.nautico.entities.Socio;
import es.club.nautico.repository.SocioRepository;


@Service
public class SocioServiceImplMy8 implements SocioService{

	@Autowired
	private SocioRepository srepo;
	@Override
	public Socio findById(int idSocio) {
		// TODO Auto-generated method stub
		return srepo.findById(idSocio).orElse(null);
	}

	@Override
	public Socio updateOne(Socio socio) {
		// TODO Auto-generated method stub
		try {
			return srepo.save(socio);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Socio insertOne(Socio socio) {
		// TODO Auto-generated method stub
		try{
			return srepo.save(socio);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int deleteOne(int idSocio) {
		// TODO Auto-generated method stub
		 Socio socio = srepo.findById(idSocio).orElse(null);
		try {
			srepo.delete(socio);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

	@Override
	public List<Socio> findAll() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

}
