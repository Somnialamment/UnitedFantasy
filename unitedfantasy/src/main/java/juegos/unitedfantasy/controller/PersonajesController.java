package juegos.unitedfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

import juegos.unitedfantasy.model.Personajes;
import juegos.unitedfantasy.service.PersonajesService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/personajes")
public class PersonajesController {
	@Autowired
	private PersonajesService personajesServicio;
	
	@GetMapping("")
	public List<Personajes> obtenerPersonajes(){
		return personajesServicio.obtenerPersonajes();
	}
		
	@PostMapping("/guardar")
	public Personajes guardarPersonajes(@RequestBody Personajes personajes) {
		return personajesServicio.guardarPersonaje(personajes);
	}
}