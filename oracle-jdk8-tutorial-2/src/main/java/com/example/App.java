package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		//El array es un identificador que hace referencia a una zona de memoria,
		// a diferncia de una variable que hace referencia a una sola ubicacion
		// en la memoria, y que puede contener elementos de un mismo tipo de datos
		// A los elementos del arrays se pueden acceder utilizando un indice numerico,
		// entero, entre corchetes
		
		/*¿Como se declara un array actualmente?*/
		// por ejemplo, un array de String
		// El identificador nombre es un array donde cada elememto del array
		// es de tipo String
		
		//¿Que ventajas nos ofrece?
		// Que en lugar de crerauna variable por cada elemento ahora solo tenemos
		// un nombre para todo el conjunto de los elementos y es mucho mas escalable 
		// porque podremos tratar 10, 20, o un millon de elementos de la misma forma 
		
		// Si no existieran los arrays, entonces tendriamos que crear una variable por cada elemento, 
		//lo cual no es nada practicoe
		
		String nombre1;
		String nombre2;
		
		String nombren; // n significa un numero cualquiera, es decir, n puede ser 10, 20, o un millon , 
		//pero no es una variable, es solo una forma de representar que hay muchos
		//elementos
		
		String[] nombres = {
		"Yodalis",
		"Jakelin",
		"Yoselin"
		
		};
		System.out.println("Arrays original de nombres: ");
		System.out.println(nombres[0]); // Yodalis
		System.out.println(nombres[1]); // Jakelin
		System.out.println(nombres[2]); // Yoselin
		
		System.out.println("El arrays de nombres tiene" +nombres.length + "elementos");
		// Tamaño fijo implica que no se pueden agregar mas elementos al array, 
		// pero si se pueden modificar los elementos existentes
		
		// nombres[3] = "Marisol";

		nombres[2] = "Marisol";

		System.out.println("Array de nombres modificado");

		System.out.println(nombres[2]);

		
		
		int[] arrayNumerosEnteros = {1, 2, 3, 4, 5};
		
	}
	
	//Array de 3 manzanas
	
//	Manzana [] manzanas = { new Manzana("roja", "dulce", "red delicious", 10, 0.5, new BigDecimal(valueOf(0.5))),
//			new Manzana("verde", "acida", "Granny Smith", 12, 0.6, new BigDecimal(valueOf(0.6))),
//			new Manzana("amarilla", "dulce", "Golden Delicious", 8, 0.4, new BigDecimal(valueOf(0.4)))	
//			
			
			Manzana [] manzanas = {
					Manzana.builder()
					.color("roja")
					.sabor("dulce")
					.variedad("red delicious")
					.size(10)
					.peso(0.5)
					.precio(new BigDecimal(0.5))
					.build(),
					
					Manzana.builder()
					.color("verde")
					.sabor("acida")
					.variedad("Granny Smith")
					.size(12)
					.peso(0.6)
					.precio(new BigDecimal(0.6))
					.build(),
					
					Manzana.builder()
					.color("amarilla")
					.sabor("dulce")
					.variedad("Golden Delicious")
					.size(8)
					.peso(0.4)
					.precio(new BigDecimal(0.4))
					.build()
			};
			
			// Hata el momento los arrays  que hemos creado son de tamaño fijo, es decir, 
			//que no se pueden modificar una vez que se han creado
			
			/* Declarar arrays que sean modificables, es decir, que se le puedan
			* agregar o eliminar elementos o modificar los elementos existentes */

{
	{
			String[] nombre2  = new String[3];
			
			// 	El array de nombres2 tiene 3 elementos, pero todos los elementos son null
			// porque no se le ha asignado un valor aun. Con la sentencia anterior
			// se ha reservado espacio en la memoria para 3 elkementos de tipo String.
			// No sera posible pasarse de la cantidad de elementos reservados para el array
			// que en el caso anterior es de 3.String con tamaño fijo de 3 elementos 
			
			//Agregando elementos al array de nombres2
			nombre2[0] = "Yodalis";
			nombre2[1] = "Jakelin";
			nombre2[2] = "Yoselin";
	}
}	}


			
			
