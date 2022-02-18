package com.edix.calculadora;

/**
 * <h2>Clase Resta, realiza la resta de dos o tres n�meros reales o enteros y la
 * resta con valor acumulado.</h2>
 * 
 * Esta clase se utiliza para implementar todos los m�todos que est�n
 * relacionados con las operaciones de resta de la calculadora.<br>
 * 
 * M�s informaci�n sobre resta de n�meros enteros en
 * <a href="https://cutt.ly/oIgfxsb">restaEnteros</a><br>
 * M�s informaci�n sobre resta de n�meros reales en
 * <a href="https://cutt.ly/mIgfgqu">restaReales</a>
 * 
 * @see Suma
 * @see Producto
 * @see Cociente
 * @see Calculadora
 * 
 * @author Israel Serrano, Pablo Baldazo, Ricardo Alvarado
 * @version 1.1
 */

public class Resta {

	private static final int LIMITE = 2147483647;
	/**
	 * Acumulado de la resta que se realiza de manera iterativa.
	 */

	private int acumulado;

	public int getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(int acumulado) {
		this.acumulado = acumulado;
	}

	/**
	 * Este m�todo realiza la resta de dos n�meros enteros positivos y devuelve el
	 * resultado de dicha resta.
	 * 
	 * @param num1 Primer operando de la resta, no puede exceder el valor 2147483647
	 *             y no puede ser negativo.
	 * @param num2 Segundo operando de la resta, no puede exceder el valor
	 *             2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la resta.<br>
	 *         Si el resultado supera el l�mite de int (-2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public int restaDosEnteros(int num1, int num2) {

		int resultado = 0;

		if (num1 < 0 || num2 < 0)
			return -100;
		else if (num1 > LIMITE || num2 > LIMITE)
			return -102;
		else
			resultado = num1 - num2;

		if (resultado < -LIMITE)
			return -103;
		else
			return resultado;

	}

	/**
	 * Este m�todo realiza la resta de dos n�meros reales positivos y devuelve el
	 * resultado de dicha resta.
	 * 
	 * @param real1 Primer operando de la resta, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la resta, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la resta.<br>
	 *         Si El resultado supera el l�mite de int (-2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public double restaDosReales(double real1, double real2) {

		double resultado = 0;

		if (real1 < 0 || real2 < 0)
			return -100;
		else if (real1 > LIMITE || real2 > LIMITE)
			return -102;
		else
			resultado = real1 - real2;

		if (resultado < -LIMITE)
			return -103;
		else
			return resultado;

	}

	/**
	 * Este m�todo realiza la resta de tres n�meros reales positivos y devuelve el
	 * resultado de dicha resta.
	 * 
	 * @param real1 Primer operando de la resta, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real2 Segundo operando de la resta, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @param real3 Tercer operando de la resta, no puede exceder el valor
	 *              2147483647 y no puede ser negativo.
	 * @return Devuelve el resultado de la resta.<br>
	 *         Si el resultado supera el l�mite de int (-2,147,483,647) devuelve el
	 *         c�digo de error -103.<br>
	 *         En caso de que uno de los par�metros sea negativo devuelve el c�digo
	 *         de error: -100.<br>
	 *         Si alguno de los par�metros es mayor a 2,147,483,647 (l�mite del int)
	 *         devuelve el c�digo de error: -102.
	 */

	public double restaTresReales(double real1, double real2, double real3) {

		double resultado = 0;

		if (real1 < 0 || real2 < 0 || real3 < 0)
			return -100;
		else if (real1 > LIMITE || real2 > LIMITE || real3 > LIMITE)
			return -102;
		else
			resultado = real1 - real2 - real3;

		if (resultado < -LIMITE)
			return -103;
		else
			return resultado;

	}

	/**
	 * Este m�todo acumula la resta de los valores de manera iterativa.<br>
	 * En caso de que el par�metro sea negativo devuelve el c�digo de error:
	 * -100.<br>
	 * Si el resultado supera el l�mite de int (-2,147,483,647) devuelve el c�digo
	 * de error -103
	 * 
	 * @param num N�mero introducido para restar al valor acumulado, no puede
	 *            exceder el valor 2147483647 y no puede ser negativo.
	 */

	public void acumulador(int num) {

		if (num < 0)
			System.out.println(-100);
		else if (num > LIMITE)
			System.out.println(-102);
		else
			acumulado -= num;
		if (acumulado < -LIMITE)
			System.out.println(-103);

	}
}
