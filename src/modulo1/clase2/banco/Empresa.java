package modulo1.clase2.banco;

import java.time.LocalDate;
import java.time.Period;

class Empresa {

	int numCliente;
	int cuit;
	String razonSocial;
	Direccion direccion;
	LocalDate fechaConstitucion;
	
	CuentaCorriente cuentaCorriente;
	
	
	int calcularAntiguedad() {
		return Period.between(fechaConstitucion, LocalDate.now()).getYears();
	}
}
