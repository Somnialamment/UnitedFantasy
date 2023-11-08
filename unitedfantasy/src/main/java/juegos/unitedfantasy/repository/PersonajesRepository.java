package juegos.unitedfantasy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import juegos.unitedfantasy.model.Personajes;

@Repository
public interface PersonajesRepository extends MongoRepository<Personajes, String> {

}