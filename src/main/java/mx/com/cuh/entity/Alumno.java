package mx.com.cuh.entity;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTROL")
public class Alumno {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_id_seq")
@SequenceGenerator(name = "school_id_seq", sequenceName = "Seq_I",  allocationSize=1)
private Long matricula;



@Column(name = "Alumno")
private String Alumno;

@Column(name = "NOMBRE")
private String nombre;

@Column(name = "Monto")
private Double monto;

@Column(name = "FechaPago")
private String FechaPago;





public String getFechaPago() {
	return FechaPago;
}

public void setFechaPago(String fechaPago) {
	FechaPago = fechaPago;
}

public Double getMonto() {
	return monto;
}

public void setMonto(Double monto) {
	this.monto = monto;
}



public Long getMatricula() {
	return matricula;
}

public void setMatricula(Long matricula) {
	this.matricula = matricula;
}

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


}
