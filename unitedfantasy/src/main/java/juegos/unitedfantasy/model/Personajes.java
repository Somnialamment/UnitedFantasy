package juegos.unitedfantasy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="personajes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Personajes {
	@Id
	String id;
	
	String nombre_personaje;
	
	String clase_personaje;
	
	boolean es_principal;
}
