package mx.com.cuh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOR")
public class Autor {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_id_seq")
	@SequenceGenerator(name = "school_id_seq", sequenceName = "TABLAAPI_SQL",  allocationSize=1)
	@Column(name = "CODIGOAUTOR")
	private Long codigoAutor;
	
	@Column(name = "NOMBRE")
	private String nombre;

	public Long getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(Long codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
