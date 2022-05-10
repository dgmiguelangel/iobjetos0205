package modulo2.clase3.banco.constructores;

import java.time.LocalDate;
import java.time.Period;

public class Empresa {

	private int numCliente;
	private int cuit;
	private String razonSocial;
	private Direccion direccion;
	private LocalDate fechaConstitucion;	
	private CuentaCorriente cuentaCorriente;	
	
	
	public Empresa(int numCliente, int cuit, String razonSocial, Direccion direccion, LocalDate fechaConstitucion,
			CuentaCorriente cuentaCorriente) {
		super();
		this.numCliente = numCliente;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.fechaConstitucion = fechaConstitucion;
		this.cuentaCorriente = cuentaCorriente;
	}


	public int calcularAntiguedad() {
		return Period.between(fechaConstitucion, LocalDate.now()).getYears();
	}


	public int getNumCliente() {
		return numCliente;
	}


	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}


	public int getCuit() {
		return cuit;
	}


	public void setCuit(int cuit) {
		this.cuit = cuit;
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


	public LocalDate getFechaConstitucion() {
		return fechaConstitucion;
	}


	public void setFechaConstitucion(LocalDate fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}


	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}


	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
	
	
}
