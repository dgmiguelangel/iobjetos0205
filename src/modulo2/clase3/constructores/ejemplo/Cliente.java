package modulo2.clase3.constructores.ejemplo;

public class Cliente {

	private int id;
	private String razonSocial;
	private Direccion direccion;

	public Cliente() {
		super();
	}

	public Cliente(int id, String razonSocial, Direccion direccion) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
	}

	public String informarDatos() {

		return "id: " + id + ", razon social: " + razonSocial + ", direccion: " + (direccion != null
				? direccion.getCalle() + " " + direccion.getNumero()
				: null);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
