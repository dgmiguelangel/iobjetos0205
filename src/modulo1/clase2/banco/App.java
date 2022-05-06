package modulo1.clase2.banco;

import java.time.LocalDate;

class App {

	public static void main(String[] args) {

		Sucursal suc = new Sucursal();
		suc.numSucursal = 1;
		suc.razonSocial = "Banco IT";
		suc.fechaConstitucion = LocalDate.of(2005, 12, 1);

		Direccion dir = new Direccion();
		dir.calle = "oliden";
		dir.numero = 2563;

		suc.direccion = dir;

		System.out.println("NroSucursal: " + suc.numSucursal + ", Nombre: " + suc.razonSocial + ", Direccion: "
				+ suc.direccion.calle + " " + suc.direccion.numero);

		for (Particular cli : suc.infCliParticulares()) {
			System.out.println("NroCliente: " + cli.numCliente + ", NroCajaAhorro: " + cli.cajaAhorro.numCuenta
					+ ", Saldo: " + cli.cajaAhorro.saldo);
		}

	}

}
