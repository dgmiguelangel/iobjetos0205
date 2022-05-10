package modulo2.clase3.banco.constructores;

import java.time.LocalDate;

class App {

	public static void main(String[] args) {

		Sucursal suc = new Sucursal(1, "Banco IT", LocalDate.of(2005, 12, 1), new Direccion("oliden", 2563));

		System.out.println("NroSucursal: " + suc.getNumSucursal() + ", Nombre: " + suc.getRazonSocial()
				+ ", Direccion: " + suc.getDireccion().getCalle() + " " + suc.getDireccion().getNumero());

		for (Particular cli : suc.infCliParticulares()) {
			System.out.println("NroCliente: " + cli.getNumCliente() + ", NroCajaAhorro: "
					+ cli.getCajaAhorro().getNumCuenta() + ", Saldo: " + cli.getCajaAhorro().getSaldo());
		}

	}

}
