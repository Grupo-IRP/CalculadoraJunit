package com.edix.calculadora;



/**
 * <h2>Clase Producto, realiza la multiplicaci�n de dos o tres n�meros reales o
 * enteros y la potencia de un n�mero.</h2>
 * 
 * Esta clase se utiliza para implementar todos los m�todos que est�n
 * relacionados con las operaciones de multiplicaci�n de la calculadora.<br>
 * 
 * M�s informaci�n sobre multiplicaci�n de n�meros enteros en
 * <a href="https://cutt.ly/KIgjFwq">productoEnteros</a><br>
 * M�s informaci�n sobre multiplicaci�n de n�meros reales en
 * <a href="https://cutt.ly/rIgjKLM">productoReales</a>
 * 
 * @see Suma
 * @see Resta
 * @see Cociente
 * @see Calculadora
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 */

public class Producto {
	

	private static final int LIMITE = 2147483647;

	/**
	 * Este m�todo realiza la multiplicaci�n de dos n�meros enteros positivos y
	 * devuelve el resultado de dicha multiplicaci�n.
	 * 
	 * @param num1 Primer operando de la multiplicaci�n, no puede exceder el valor
	 *             2147483647 y no puede ser negativo.
	 * @param num2 Segundo operando de la multiplicaci�n, no puede exceder el valor
	 *             2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicaci�n.<br>
	 *         Si el resultado supera el l�mite de int (2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public int productoDosEnteros(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -100;
		}

		else if (num1 > LIMITE || num2 > LIMITE) {
			return -102;
		}
        
		int resultado = num1 * num2;

		if (resultado < 0) {
			return -103;
		} else {
			return resultado;
		}

	}

	/**
	 * Este m�todo realiza la multiplicaci�n de dos n�meros reales positivos y
	 * devuelve el resultado de dicha multiplicaci�n.
	 * 
	 * @param real1 Primer operando de la multiplicaci�n, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la multiplicaci�n, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicaci�n.<br>
	 *         Si el resultado supera el l�mite de int (2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public double productoDosReales(double real1, double real2) {
		if (real1 < 0 || real2 < 0) {
			return -100;
		}

		else if (real1 > LIMITE || real2 > LIMITE) {
			return -102;
		}

		double resultado = real1 * real2;

		if (resultado > LIMITE) {
			return (-103);
		} else {
			return resultado;
		}

	}

	/**
	 * Este m�todo realiza la multiplicaci�n de tres n�meros reales positivos y
	 * devuelve el resultado de dicha multiplicaci�n.
	 * 
	 * @param real1 Primer operando de la multiplicaci�n, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la multiplicaci�n, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real3 Tercer operando de la multiplicaci�n, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la multiplicaci�n.<br>
	 *         Si el resultado supera el l�mite de int (2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public double productoTresReales(double real1, double real2, double real3) {

		if (real1 < 0 || real2 < 0 || real3 < 0) {
			return -100;
		}

		else if (real1 > LIMITE || real2 > LIMITE || real3 > LIMITE) {
			return -102;
		}

		double resultado = real1 * real2 * real3;

		if (resultado > LIMITE) {
			return (-103);
		} else {
			return resultado;
		}

	}

	/**
	 * Este m�todo realiza la potencia de un n�meros entero positivo, tiene dos
	 * par�metros, el primero ser� la base y el segundo ser� el exponente. Devuelve
	 * el resultado de la potencia.<br>
	 * 
	 * @param num1 Base de la potencia, no puede exceder el valor 2147483647 y no
	 *             puede ser negativo.
	 * @param num2 Exponente de la potencia, no puede exceder el valor 2147483647 y
	 *             no puede ser negativo.
	 * @return Devuelve el resultado de la potencia.<br>
	 *         Si el resultado alcanza el l�mite de int (2,147,483,647) o lo supera,
	 *         devuelve el c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si el par�metro es mayor a 2,147,483,647 (l�mite del int) devuelve el
	 *         c�digo de error: -102.
	 * 
	 */

	public int potencia(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -100;
		}

		else if (num1 > LIMITE || num2 > LIMITE) {
			return -102;
		}

		int resultado = (int) Math.pow(num1, num2);

		if (resultado >= LIMITE) {
			return -103;
		} else {
			return resultado;
		}

	}
	
	
}
