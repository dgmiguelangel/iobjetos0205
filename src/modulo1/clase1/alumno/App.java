package modulo1.clase1.alumno;

import java.time.LocalDate;

class App {

	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno();
		alu1.dni = 1;
		alu1.nombre = "Juan";
		alu1.apellido = "Garcia";
		alu1.fechaNacimiento = LocalDate.of(2001, 12, 5);
		
		Direccion dir1 = new Direccion();
		dir1.calle = "Lavalle";
		dir1.numero = 1245;
		alu1.dire = dir1;
		
		Alumno alu2 = new Alumno();
		alu2.dni = 2;
		alu2.nombre = "Maria";
		alu2.apellido = "Perez";
		alu2.fechaNacimiento = LocalDate.of(2011, 10, 15);
		
		System.out.println("edad del alumno1: " + alu1.calcularEdad());
		System.out.println("edad del alumno2: " + alu2.calcularEdad());
		
	}

}
