package modulo1.clase2.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sucursal {
	
	int numSucursal;
	String razonSocial;
	LocalDate fechaConstitucion;
	Direccion direccion;
	Director director;
	
	List<Administrativo> emplAdministrativos;
	List<Particular> cliParticulares;
	List<Empresa> cliEmpresas;
	
	
	List<Particular> infCliParticulares(){
		List<Particular> lista;
		
		Particular cli1 = new Particular();
		cli1.numCliente = 1;
		cli1.dni = 1;
		cli1.nombre = "Juan";
		cli1.apellido = "Garcia";
		
		CajaAhorro ca1 = new CajaAhorro();
		ca1.numCuenta = 1;
		ca1.saldo = 156000;
		
		cli1.cajaAhorro = ca1;
		
		Particular cli2 = new Particular();
		cli2.numCliente = 2;
		cli2.dni = 2;
		cli2.nombre = "Maria";
		cli2.apellido = "Gonzalez";
		
		CajaAhorro ca2 = new CajaAhorro();
		ca2.numCuenta = 2;
		ca2.saldo = 300000;
		
		cli2.cajaAhorro = ca2;
		
		lista = Arrays.asList(cli1, cli2);
		
		return lista;
	}
	

}
