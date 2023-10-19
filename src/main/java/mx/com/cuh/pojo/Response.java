package mx.com.cuh.pojo;

public class Response {
	private String mensaje;
	private Integer codigo;
	
	

	public Response() {
		super();
		this.mensaje = mensaje;
	}

	public Response(String mensaje, Integer codigo) {
		super();
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
