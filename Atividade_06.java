package Aula_24_07;

import java.util.ArrayList;
import java.util.Random;

public class Atividade_06 {

	public static void main(String[] args) {
		

		ArrayList<Integer> numeros  = new ArrayList <> ();

		Random random = new Random();
	
		for(int i=0; i<10; i++) {
			int numeroAleatorio = random.nextInt(10);
			numeros.add(numeroAleatorio);

		}
		System.out.println("0° 1° 2° 3° 4° 5° 6° 7° 8° 9°");
		System.out.println("-----------------------------");
		System.out.println(numeros); 
	
		for(int numero : numeros) {
			
		System.out.print("[" + numero*2 + "]");
	}

	}

}


