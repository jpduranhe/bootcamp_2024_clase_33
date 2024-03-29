package clase_33;

import java.util.Scanner;

public class EjecicioMathAlgo {
	
	public static void main(String[] args) {
		double [][] historial = new double[4][4];
		
		Scanner leer= new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.println("Ingrese un Numero");
			double numeroIngresado =leer.nextDouble();
			double doble= numeroIngresado*2;
			double triple= numeroIngresado*3;				
			double raizCuadrada= Math.sqrt(numeroIngresado);
			double elevado7= Math.pow(numeroIngresado,7);
			
			historial[i][0]=doble;
			historial[i][1]=triple;
			historial[i][2]=raizCuadrada;
			historial[i][3]=elevado7;
		}
		
		System.out.println("El Doble | El Triple  |  RaizCuadrada   | Elevado a 7 |");
		System.out.println();
		for(int i=0;i<4;i++) {
			
			System.out.print(historial[i][0]+"|");
			System.out.print(historial[i][1]+"|");
			System.out.print(historial[i][2]+"|");
			System.out.print(historial[i][3]+"|");
			System.out.println();
		}
		
	}
	
	
	
	

}
