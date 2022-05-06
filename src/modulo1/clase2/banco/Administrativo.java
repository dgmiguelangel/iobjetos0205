package modulo1.clase2.banco;

import java.time.LocalDate;
import java.time.Period;

class Administrativo {

	int dni;
	int legajo;
	String nombre;
	String apellido;
	Direccion direccion;
	LocalDate fechaNacimiento;
	LocalDate fechaIngreso;
	double sueldo;
	Area area;
	
	int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	int calcularAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}
}
