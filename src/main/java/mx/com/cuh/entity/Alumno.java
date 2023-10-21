package mx.com.cuh.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Control")
public class Alumno {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_id_seq")
@SequenceGenerator(name = "school_id_seq", sequenceName = "SQL_TABLAAPI",  allocationSize=1)
@Column(name = "Alumno")
private String Alumno;

@Column(name = "NOMBRE")
private String nombre;

@Column(name="Monto")
private Double monto;

@Column(name="fechaPago")
private LocalDate fechaPago;


public String getAlumno() {
	return Alumno;
}

public void setAlumno(String alumno) {
	Alumno = alumno;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Double getMonto() {
	return monto;
}

public void setMonto(Double monto) {
	this.monto = monto;
}

public LocalDate getFechaPago() {
	return fechaPago;
}

public void setFechaPago(LocalDate fechaPago) {
	this.fechaPago = fechaPago;
}
}


