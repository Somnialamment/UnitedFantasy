package juegos.unitedfantasy.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import juegos.unitedfantasy.model.Personajes;
import juegos.unitedfantasy.repository.PersonajesRepository;

@Service
public class PersonajesService {
	@Autowired
	private PersonajesRepository personajesRepositorio;
	
	public List<Personajes> obtenerPersonajes(){
		return personajesRepositorio.findAll();
	}
	
	public Personajes guardarPersonaje(Personajes personajeAGuardar) {
		personajeAGuardar.setId(UUID.randomUUID().toString().split("-")[0]);
		return personajesRepositorio.save(personajeAGuardar);
	}
	
}