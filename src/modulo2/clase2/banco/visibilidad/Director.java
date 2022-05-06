package modulo2.clase2.banco.visibilidad;

import java.time.LocalDate;
import java.time.Period;

public class Director {
	
	private int dni;
	private int legajo;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private LocalDate fechaNacimiento;
	private LocalDate fechaIngreso;
	private double sueldo;
	private double bono;
	
	public int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public int calcularAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

}
