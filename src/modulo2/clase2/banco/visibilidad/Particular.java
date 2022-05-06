package modulo2.clase2.banco.visibilidad;

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
	
	public int calcularAntiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}

}
