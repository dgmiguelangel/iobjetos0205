package modulo2.clase2.sobrecarga;

class Calculadora {
	
	int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}		
	
	double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
	float sumar(float num1, float num2) {
		return num1 + num2;
	}

}
