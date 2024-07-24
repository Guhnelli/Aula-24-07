package Aula_24_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade_02 {

	public static void main(String[] args) {

		String[] diciplina = {"matematica, filosofia, historia, fisica"};

		ArrayList<String> nova_lista  = new ArrayList<String> (Arrays.asList(diciplina));

		nova_lista.add("geografia");
		nova_lista.add("Lingua Portuguesa");
		nova_lista.add("quimica");
		nova_lista.add("arte");

		for (String i: nova_lista) {
			{

				System.out.println("diciplinas: " + i );

			}

		}
	}
}
