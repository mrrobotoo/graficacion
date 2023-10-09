package mx.com.cuh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOR")
public class Autor {
	
	@Id
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
