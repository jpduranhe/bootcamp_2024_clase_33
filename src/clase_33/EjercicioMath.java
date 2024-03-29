package clase_33;

public class EjercicioMath {

	public static void main(String[] args) {
	
/*
 * Desarrollar un programa que tome como dato de entrada un número que corresponde 
 * a la longitud del radio una esfera y que calcule y escriba el volumen de la esfera que se 
 * corresponde con dicho radio.

	La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3

 * 
 * 
 * */
		double valorIngresado=20;
		// r^3
		double volumen=(4/3) * Math.PI *  Math.pow(valorIngresado, 3);
		
		System.out.println("Volumen de la Esfera es : "+volumen);
		
		
		
		
		double numAleatorio= Math.random()*10;
		double numAleatorio1_1= numAleatorio*100;
		double numAleatorio1_1_1= Math.round(numAleatorio1_1);
		double numAleatorio1_1_1_1=numAleatorio1_1_1/100;
		System.out.println("numAleatorio1_1_1: "+numAleatorio1_1_1_1);
		
		System.out.println("numAleatorio: "+numAleatorio);
		System.out.println("numAleatorio con floor: "+ (Math.floor(numAleatorio)));
		System.out.println("numAleatorio con round: "+ (Math.round(numAleatorio)));
		System.out.println("numAleatorio con ceil: "+ (Math.ceil(numAleatorio)));
		System.out.println();
		
		double numAleatorio2= Math.random()*100;
		System.out.println("numAleatorio2: "+numAleatorio2);
		double numAleatorio3= Math.random()*1000;
		System.out.println("numAleatorio3: "+numAleatorio3);
		System.out.println();
		
		double maxAleatorio=Math.max(numAleatorio2, numAleatorio3);
		System.out.println("maxAleatorio: "+ maxAleatorio);
		
		
		
		

	}

}
