package modulo1.clase2.banco;

class CuentaCorriente {
	
	int numCuenta;
	int cbu;
	double saldo;
	String moneda;
	double descubierto;
	
	void depositar(double importe) {
		saldo += importe;
	}
	
	void extraer(double importe) {
		saldo -= importe;
	}

}
