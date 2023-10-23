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
@Table(name = "Colegiatura")
public class Colegiatura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colegiatura_id_seq")
    @SequenceGenerator(name = "colegiatura_id_seq", sequenceName = "SQL_COLEGIATURA", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Alumno")
    private String alumno; 

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "FechaPago")
    private LocalDate fechaPago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
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