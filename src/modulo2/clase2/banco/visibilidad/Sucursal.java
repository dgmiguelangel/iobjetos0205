package modulo2.clase2.banco.visibilidad;

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
	
	
	public List<Particular> infCliParticulares(){
		List<Particular> lista = null;		
		
//		Particular cli1 = new Particular();
//		cli1.setNumCliente(1);
//		cli1.setDni(1);
//		cli1.setNombre("Juan");
//		cli1.setApellido("Garcia");
//		
//		CajaAhorro ca1 = new CajaAhorro();
//		ca1.setNumCuenta(1);
//		ca1.setSaldo(156000);
//				
//		cli1.setCajaAhorro(ca1);
//		
//		Particular cli2 = new Particular();
//		cli2.setNumCliente(2);
//		cli2.setDni(2);
//		cli2.setNombre("Maria");
//		cli2.setApellido("Gonzalez");
//		
//		CajaAhorro ca2 = new CajaAhorro();
//		ca2.setNumCuenta(2);
//		ca2.setSaldo(300000);
//		
//		cli2.setCajaAhorro(ca2);
//		
//		lista = Arrays.asList(cli1, cli2);		
		
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
