package mx.com.cuh.pojo;

import java.time.LocalDate;

public class ColegiaturaRequest {
private Long alumnoId;
public Long getAlumnoId() {
	return alumnoId;
}
public void setAlumnoId(Long alumnoId) {
	this.alumnoId = alumnoId;
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
private Double monto;
private LocalDate fechaPago;
}
