package modulo1.clase2.banco;

import java.time.LocalDate;
import java.time.Period;

class Particular {
	
	int numCliente;
	int dni;
	String nombre;
	String apellido;
	Direccion direccion;
	LocalDate fechaAlta;
	
	CajaAhorro cajaAhorro;
	CuentaCorriente cuentaCorriente;
	
	int calcularAntiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}

}
