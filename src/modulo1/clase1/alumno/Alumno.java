package modulo1.clase1.alumno;

import java.time.LocalDate;
import java.time.Period;

class Alumno {
	
	int dni;
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	Direccion dire;
	
	int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}	

}
