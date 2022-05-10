package modulo2.clase3.banco.constructores;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import modulo2.clase2.banco.visibilidad2.CajaAhorro;

public class Sucursal {
	
	private int numSucursal;
	private String razonSocial;
	private LocalDate fechaConstitucion;
	private Direccion direccion;
	private Director director;
	
	private List<Administrativo> emplAdministrativos;
	private List<Particular> cliParticulares;
	private List<Empresa> cliEmpresas;	
	
	
	public Sucursal(int numSucursal, String razonSocial, LocalDate fechaConstitucion, Direccion direccion) {
		super();
		this.numSucursal = numSucursal;
		this.razonSocial = razonSocial;
		this.fechaConstitucion = fechaConstitucion;
		this.direccion = direccion;
	}


	public Sucursal(int numSucursal, String razonSocial, LocalDate fechaConstitucion, Direccion direccion,
			Director director) {
		super();
		this.numSucursal = numSucursal;
		this.razonSocial = razonSocial;
		this.fechaConstitucion = fechaConstitucion;
		this.direccion = direccion;
		this.director = director;
	}


	public List<Particular> infCliParticulares(){
		List<Particular> lista = null;		
		
		CajaAhorro ca1 = new CajaAhorro(1, 156000);				
		Particular cli1 = new Particular(1, 1, "Juan", "Garcia", ca1);	
		
		CajaAhorro ca2 = new CajaAhorro(2, 300000);
		Particular cli2 = new Particular(2, 2, "Maria", "Gonzalez", ca2);
		
		lista = Arrays.asList(cli1, cli2);		
		
		return lista;
	}


	public int getNumSucursal() {
		return numSucursal;
	}


	public void setNumSucursal(int numSucursal) {
		this.numSucursal = numSucursal;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public LocalDate getFechaConstitucion() {
		return fechaConstitucion;
	}


	public void setFechaConstitucion(LocalDate fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public Director getDirector() {
		return director;
	}


	public void setDirector(Director director) {
		this.director = director;
	}


	public List<Administrativo> getEmplAdministrativos() {
		return emplAdministrativos;
	}


	public void setEmplAdministrativos(List<Administrativo> emplAdministrativos) {
		this.emplAdministrativos = emplAdministrativos;
	}


	public List<Particular> getCliParticulares() {
		return cliParticulares;
	}


	public void setCliParticulares(List<Particular> cliParticulares) {
		this.cliParticulares = cliParticulares;
	}


	public List<Empresa> getCliEmpresas() {
		return cliEmpresas;
	}


	public void setCliEmpresas(List<Empresa> cliEmpresas) {
		this.cliEmpresas = cliEmpresas;
	}
	
	
	
	

}
