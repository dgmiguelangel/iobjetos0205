package modulo2.clase2.banco.visibilidad;

import java.time.LocalDate;
import java.time.Period;

public class Empresa {

	private int numCliente;
	private int cuit;
	private String razonSocial;
	private Direccion direccion;
	private LocalDate fechaConstitucion;
	
	private CuentaCorriente cuentaCorriente;
	
	
	public int calcularAntiguedad() {
		return Period.between(fechaConstitucion, LocalDate.now()).getYears();
	}
}
