package modulo2.clase2.banco.visibilidad;

import java.time.LocalDate;

class App {

	public static void main(String[] args) {

		Sucursal suc = new Sucursal();
		suc.setNumSucursal(1);
		suc.setRazonSocial("Banco IT");
		suc.setFechaConstitucion(LocalDate.of(2005, 12, 1));

		Direccion dir = new Direccion();
		dir.setCalle("oliden");
		dir.setNumero(2563);

		suc.setDireccion(dir);

		System.out.println("NroSucursal: " + suc.getNumSucursal() + ", Nombre: " + suc.getRazonSocial()
				+ ", Direccion: " + suc.getDireccion().getCalle() + " " + suc.getDireccion().getNumero());

		for (Particular cli : suc.infCliParticulares()) {
			System.out.println("NroCliente: " + cli.getNumCliente() + ", NroCajaAhorro: "
					+ cli.getCajaAhorro().getNumCuenta() + ", Saldo: " + cli.getCajaAhorro().getSaldo());
		}

	}

}
