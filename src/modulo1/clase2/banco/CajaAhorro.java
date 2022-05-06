package modulo1.clase2.banco;

class CajaAhorro {
	
	int numCuenta;
	int cbu;
	double saldo;
	String moneda;
	
	void depositar(double importe) {
		saldo += importe;
	}
	
	void extraer(double importe) {
		saldo -= importe;
	}

}
