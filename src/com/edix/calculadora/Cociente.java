package com.edix.calculadora;

/**
 * <h2>Clase Cociente, realiza la divisi�n de dos n�meros reales o enteros, el
 * inverso de un n�mero real y la ra�z de un n�mero.</h2>
 * 
 * Esta clase se utiliza para implementar todos los m�todos que est�n
 * relacionados con las operaciones de divisi�n de la calculadora.<br>
 * 
 * M�s informaci�n sobre divisi�n de n�meros enteros en
 * <a href="https://cutt.ly/SIgzfAW">cocienteEnteros</a><br>
 * M�s informaci�n sobre divisi�n de n�meros reales en
 * <a href="https://cutt.ly/WIglHaw">cocienteReales</a>
 * 
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Calculadora
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 */

public class Cociente {

	private static final int LIMITE = 2147483647;

	/**
	 * 
	 * Este m�todo realiza la divisi�n de dos n�meros enteros positivos y devuelve
	 * el cociente y en el caso de que el resultado no sea exacto tambi�n el
	 * resto.<br>
	 * 
	 * 
	 * @param num1 Dividendo de la divisi�n, no puede exceder el valor 2147483647 y
	 *             no puede ser negativo.
	 * @param num2 Divisor de la divisi�n, no puede exceder el valor 2147483647 y no
	 *             puede ser negativo.
	 * 
	 * @return Devuelve el cociente y en el caso de que el resultado no sea exacto
	 *         tambi�n el resto.<br>
	 *         Si el resultado supera el l�mite de int (-2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public String cocienteDosEnteros(int num1, int num2) {

		int resultado = 0, resto = 0;

		if (num1 < 0 || num2 < 0)
			return "-100";
		else if (num1 == 0 || num2 == 0)
			return "-101";
		else if (num1 > LIMITE || num2 > LIMITE)
			return "-102";
		else {
			resultado = num1 / num2;
			resto = num1 % num2;

			if (num1 % num2 != 0)
				return "Cociente = " + resultado + " Resto = " + resto;
			else
				return "Cociente = " + resultado;
		}

	}

	/**
	 * Este m�todo realiza la divisi�n de dos n�meros reales positivos y devuelve el
	 * cociente y en el caso de que el resultado no sea exacto tambi�n el resto.<br>
	 * 
	 * 
	 * @param real1 Dividendo de la divisi�n, no puede exceder el valor 2147483647 y
	 *              no puede ser negativo.
	 * @param real2 Divisor de la divisi�n, no puede exceder el valor 2147483647 y
	 *              no puede ser negativo.
	 * @return Devuelve el cociente y en el caso de que el resultado no sea exacto
	 *         tambi�n el resto.<br>
	 *         Si el resultado supera el l�mite de int (-2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public String cocienteDosReales(double real1, double real2) {

		double resultado = 0, resto = 0;

		if (real1 < 0 || real2 < 0)
			return "-100";
		else if (real1 == 0 || real2 == 0)
			return "-101";
		else if (real1 > LIMITE || real2 > LIMITE)
			return "-102";
		else {
			resultado = real1 / real2;
			resto = real1 % real2;

			if (real1 % real2 != 0)
				return "Cociente = " + resultado + " Resto = " + resto;
			else
				return "Cociente = " + resultado;
		}

	}

	/**
	 * Este m�todo calcula el inverso de un n�mero real positivo y devuelve el
	 * resultado.
	 * 
	 * @param real1 N�mero que se va a invertir, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el inverso del valor introducido.<br>
	 *         En caso de el par�metro sea negativo devuelve el c�digo de error:
	 *         -100.<br>
	 *         En caso de el par�metro sea cero devuelve el c�digo de error:
	 *         -101.<br>
	 *         Si el par�metro es mayor a 2,147,483,647 (l�mite del int) devuelve el
	 *         c�digo de error: -102.
	 */

	public double inverso(double real1) {

		if (real1 < 0)
			return -100;
		else if (real1 == 0)
			return -101;
		else if (real1 > LIMITE)
			return -102;
		else
			return 1 / real1;

	}

	/**
	 * Este m�todo calcula la ra�z cuadrada de un n�mero entero y devuelve como
	 * resultado un n�mero real.
	 * 
	 * @param num1 N�mero del cual se calcula la ra�z cuadrada, no puede exceder el
	 *             valor 2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la ra�z cuadrada.<br>
	 *         En caso de el par�metro sea negativo devuelve el c�digo de error:
	 *         -100.<br>
	 *         En caso de el par�metro sea cero devuelve el c�digo de error:
	 *         -101.<br>
	 *         Si el par�metro es mayor a 2,147,483,647 (l�mite del int) devuelve el
	 *         c�digo de error: -102.
	 */

	public double raiz(int num1) {

		if (num1 < 0)
			return -100;
		else if (num1 == 0)
			return -101;
		else if (num1 > LIMITE)
			return -102;
		else
			return Math.sqrt(num1);

	}

}
