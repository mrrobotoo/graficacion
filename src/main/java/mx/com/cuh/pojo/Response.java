package mx.com.cuh.pojo;

public class Response {
	private String mensaje;

	public Response() {
		super();
		this.mensaje = mensaje;
	}

	public Response(String mensaje, Integer codigo) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
