package ejercicio42;

import java.util.Scanner;

public class CadenaAlReves
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase: ");
		String cadena = sc.nextLine();
		sc.close();
		// Se muestra desde el final al principio
		for(int i = cadena.length() - 1; i >= 0; i--)
		{
			System.out.print(cadena.charAt(i));
		}
	}
}
