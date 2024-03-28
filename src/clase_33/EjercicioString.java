package clase_33;

import java.util.Scanner;

public class EjercicioString {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solo permita introducir frases o palabras de 8 de longitud. 
		 * Si el usuario ingresa una cadena de 8 de longitud se deberá 
		 * imprimir un mensaje por pantalla que diga “CORRECTO” e imprimir la frase en mayúsculas, 
		 * en caso contrario, se deberá imprimir “INCORRECTO” y toda la frase en minúsculas.

		 */
		
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Ingrese un palabra");
		String textoIngresado=leer.next();
		
		if(textoIngresado.length()==8) {
			System.out.println("CORRECTO");
			System.out.println("La Palabra Ingresada es: "+textoIngresado.toUpperCase());
		} else {
			System.out.println("INCORRECTO");
			System.out.println("La Palabra Ingresada es: "+textoIngresado.toLowerCase());
		}
		System.out.println("largo palabara:"+textoIngresado.charAt(0));
		for(int i=0; i<textoIngresado.length(); i++) {
			System.out.println("--->: "+textoIngresado.charAt(i));
		}
		
		
		for (int i = 0; i < textoIngresado.length(); i++) {
            char caracter = textoIngresado.charAt(i); 
            System.out.println(caracter);
		
		}
		
		
		
		
		
		// muestra de inmutabilidad
		textoIngresado="Hola";
		System.out.println("Antes: "+textoIngresado);
		//textoIngresado=textoIngresado.toUpperCase();
		System.out.println("Modificacion: "+textoIngresado.toUpperCase());
		System.out.println("Despues: "+textoIngresado);//--> no ha cambiado su valor original
	}

}
