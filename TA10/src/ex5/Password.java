package ex5;

public class Password {

	private int longitud;
	private String contrasena;
	public Password() {
		//constructor por defecto
		this.setLongitud(8);
		this.contrasena=generarPassword();
	}
	public Password(int longi) {
		//constructor con longitud pasada por parametro
		this.setLongitud(longi);
		this.contrasena=generarPassword();
	}
	private String generarPassword() {
		// método que genera una contrasena con la longitud que tenga la clase
		String pass="";
		int random;
		for(int i=0;i<this.getLongitud();i++) {
			random=(int) (Math.random()*(126-33+1)+33);
			pass+=(char)random;
		}
		
		return pass;
	}
	public int getLongitud() {
		// getter de longitud
		return this.longitud;
	}
	public void setLongitud(int longitud) {
		// setter de longitud
		this.longitud = longitud;
	}
	public String getContrasena() {
		// getter de contrasena
		return this.contrasena;
	}
	
	public boolean esFuerte() {
		int numero=0,minus=0,majus=0;
		for (int i=0;i<this.longitud;i++) {
			if(Character.isDigit(this.contrasena.charAt(i))) numero++;
			else if(Character.isUpperCase(this.contrasena.charAt(i)))majus++;
			else if(Character.isLowerCase(this.contrasena.charAt(i)))minus++;
		}
		if(numero>5 && minus>1 && majus>2) return true;
		else return false;
	}

}
