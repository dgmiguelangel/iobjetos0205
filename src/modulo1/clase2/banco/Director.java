package modulo1.clase2.banco;

import java.time.LocalDate;
import java.time.Period;

class Director {
	
	int dni;
	int legajo;
	String nombre;
	String apellido;
	Direccion direccion;
	LocalDate fechaNacimiento;
	LocalDate fechaIngreso;
	double sueldo;
	double bono;
	
	int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	int calcularAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

}
