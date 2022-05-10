package modulo2.clase3.banco.constructores;

import java.time.LocalDate;
import java.time.Period;

import modulo2.clase2.banco.visibilidad2.CajaAhorro;

public class Particular {
	
	private int numCliente;
	private int dni;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private LocalDate fechaAlta;	
	private CajaAhorro cajaAhorro;
	private CuentaCorriente cuentaCorriente;	
	
	
	public Particular(int numCliente, int dni, String nombre, String apellido, CajaAhorro cajaAhorro) {
		super();
		this.numCliente = numCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cajaAhorro = cajaAhorro;
	}

	public Particular(int numCliente, int dni, String nombre, String apellido, Direccion direccion, LocalDate fechaAlta,
			CajaAhorro cajaAhorro, CuentaCorriente cuentaCorriente) {
		super();
		this.numCliente = numCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
		this.cajaAhorro = cajaAhorro;
		this.cuentaCorriente = cuentaCorriente;
	}

	public int calcularAntiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public CajaAhorro getCajaAhorro() {
		return cajaAhorro;
	}

	public void setCajaAhorro(CajaAhorro cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
	
	

}
