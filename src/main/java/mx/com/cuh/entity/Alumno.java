package mx.com.cuh.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "CONTROL")
@JsonPropertyOrder({"matricula", "nombre", "apellidos", "calificacion", "adeudos", "estado"})
public class Alumno {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_id_seq")
@SequenceGenerator(name = "school_id_seq", sequenceName = "B",  allocationSize=1)
private Long matricula;


@Column(name = "NOMBRE")
private String nombre;

@Column(name = "Apellidos")
private String Apellidos;

@Column(name = "Calificacion")
private Double calificacion;

@Column(name = "Adeudos")
private String Adeudos;

@Column(name = "Estado")
private String Estado;


public Double getCalificacion() {
	return calificacion;
}

public void setCalificacion(Double calificacion) {
	this.calificacion = calificacion;
}

public String getAdeudos() {
	return Adeudos;
}

public void setAdeudos(String adeudos) {
	Adeudos = adeudos;
}

public String getEstado() {
	return Estado;
}

public void setEstado(String estado) {
	Estado = estado;
}

public String getApellidos() {
	return Apellidos;
}

public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}


public Long getMatricula() {
	return matricula;
}

public void setMatricula(Long matricula) {
	this.matricula = matricula;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
