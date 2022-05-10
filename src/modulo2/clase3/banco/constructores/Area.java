package modulo2.clase3.banco.constructores;

public class Area {
	
	private int codArea;
	private String nombre;	
	
	public Area(int codArea, String nombre) {
		super();
		this.codArea = codArea;
		this.nombre = nombre;
	}
	public int getCodArea() {
		return codArea;
	}
	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
