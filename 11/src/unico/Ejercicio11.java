package unico;

public class Ejercicio11 {

	public static void main(String[] args) {

		/*
		 * Implementar un método que calcule la superficie o el volumen de una esfera.
		 * El prototipo del método es este: static double superficieOvolumen(char
		 * peticion, double radio) El método recibe el carácter 'S' o el carácter 'V' en
		 * el primer parámetro, según quiera calcularse la superficieo el volumen. En el
		 * segundo parámetro, recibirá el valor del radio de la esfera. Las ecuaciones
		 * de los dos conceptos son estas: Volumen = 4/3 PI r^3 Superficie = 4 PI r^2
		 */

		char opc;
		double radio;
		double altura;
		double resultado = 0.00;

		opc = Util.leerChar("Indique una de las opciones siguientes [S - Cálculo de superficie, V - Cálculo de volumen]: ");
		radio = Util.leerDouble("¿Cuánto mide el radio?: ");

		resultado = calculoCilindro(opc, radio);
		Util.escribir("El resultado es: " + resultado);

	}

	public static double calculoCilindro(char peticion, double radio) {
		final double PI = 3.14;
		double resultado;
		
		switch (peticion) {
		case 's', 'S': resultado =  4/3 * PI * Math.pow(radio, 3);
		break;
		case 'v', 'V': resultado = 4 * PI * radio * radio;
		break;
		default: resultado = 0.00;
		}
		return resultado;
	}
}	
