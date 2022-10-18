package Excepciones;

public class miExcepcion extends Exception {

	private int codigoexcepcion;
	
	public miExcepcion() {
		super();
	}
	
	public miExcepcion(int codigoerror) {
		super();
		this.codigoexcepcion=codigoerror;
	}
	@Override
	public String getMessage() {
		String mensaje="";
		switch(this.codigoexcepcion) {
			case 0:
				mensaje="Esto es un objeto Exception";
				break;
			case 1:
				mensaje="Es par";
				break;
			case 2:
				mensaje="Es impar";
				break;
			case 3:
				mensaje="Valor no válido.";
			default:
				mensaje="Excepcion no identificada";
				break;
		}
		return mensaje;
		
	}


}
