package mx.com.cuh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Tienda")
public class ApiTienda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_id_seq")

	@SequenceGenerator(name = "school_id_seq", sequenceName = "TiendaAPI_SQL",  allocationSize=1)
	@Column(name = "CODIGOPRODUCTO")

	private Long CODIGOPRODUCTO;
	
	@Column(name = "Galletas")
	private String Galletas;

	public Long getCodigoProducto() {
		return CODIGOPRODUCTO;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.CODIGOPRODUCTO = codigoProducto;
	}

	public String getNombre() {
		return Galletas;
	}

	public void setNombre(String Nombre) {
		this.Galletas = Nombre;
	}
	
}

