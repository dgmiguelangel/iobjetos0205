package modulo2.clase3.banco.constructores;

public class Direccion {

	private String calle;
	private int numero;
	
	public Direccion() {
		super();
	}	
	
	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
