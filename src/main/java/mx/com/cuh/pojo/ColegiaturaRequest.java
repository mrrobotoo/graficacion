package mx.com.cuh.pojo;



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
public String getFechaPago() {
	return FechaPago;
}
public void setFechaPago(String fechaPago) {
	this.FechaPago = fechaPago;
}
private Double monto;
private String FechaPago;
}
