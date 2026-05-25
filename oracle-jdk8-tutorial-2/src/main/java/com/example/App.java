package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		// Crear un objeto Manzana sin especificar ninguna propiedad de la Manzana
		// Se utiliza el constructor sin parametros

		Manzana manzana1 = new Manzana();

		/*
		 * ¿Como imprimir en la consola el objeto referenciado por la variable manzana1
		 */
		System.out.println("------- Imprimiendo manzana1 ------- ");
		System.out.println(manzana1.toString());

		/* Utilizando Lombok no necesitamos tener todos los constructores defiunidos,
		 * solamente el constructor sin parametros o por dfecxto y el constructor
		 * que recibe todos los campos de la clase
		 * Utilizando EL PATRON BUILDER DE LOMBOK, es posible construir cualquier
		 * objeton aunque no tengas su constructor explicitamente, y tampoco estariamos
		 * obligados a suministrar los campos o propiedades del objeto en un orden
		 * determinado*/
		
		//El Patron Builder NO fue inventado por lombok, pero lo ha mejorado bastante;
		
		//El Patron Builder es patron factoria, es decir, creacional,
		// que permite creainstanciar objetos sin tener explicitamente su
		// su constructor
		
		//Manzana manzana 2 = new Manzana("Golden");
		
		Manzana manzana2 = Manzana.builder()
				.variedad("Golden")
				.build();
		
		
		System.out.println("------- Imprimiendo manzana2 ------- ");
		System.out.println(manzana2);

		/*
		 * ¿ Como comparar dos objetos Manzana para saber si son iguales o no?
		 * 
		 * Vamos a crear dos objetos Manzanas que sean de la misma vcariedad y precio*/
		
		//Manzana manzana3 = new Manzana("reineta, new BigDecimal(2.0));
		
		Manzana manzana3 = Manzana.builder()
				.variedad("reineta")
				.precio(new BigDecimal(2.0))
				.build();
		
		////Manzana manzana4 = new Manzana("reineta, new Bigdecimal(2.0));
		Manzana manzana4 = Manzana.builder()
				.variedad("reineta")
				.precio(new BigDecimal(2.0))
				.build();
		

		int x = 5;
		int y = 5;

		// Si quiero comprobar si las variables x e y son iguales, podemos utilizar una
		// sentencia de Java
		// que la tienen todos los lenguajes de programacion , denominada sentencia
		// condicional if - else
		// que evalua una condicion entre parentesis, y que si se cumple se ejecuta el
		// grupo de sentencias
		// que aparecen en el bloque encerrado entre las llaves de apartura y cierre, y
		// si no se cumple la condicion
		// se podra ejecutar la o las sentencias que estan en siguiente bloque.

 
		if (manzana3==manzana4) 
			
		{
			System.out.println("Los objetos manzana 3 y manzana 4 apuntan a la misma direccion");
		} else {
			System.out.println("Los objetos manzana 3 y manzana 4 apuntan a direcciones distintas");
			
		}
		/*
		 * Para saber si el contenido de dos objetos es el mismo se utiliza el metodo
		 * equal, porque el operador == lo que comprueba en el caso de objetos es si
		 * dichos objetos estan en la misma ubicacion de la memoria
		 */

		if (manzana3.equals(manzana4)) {
			System.out.println("Las manzanas 3 y 4 son iguales");
		} else {
			System.out.println("Las manzanas 3 y 4 no son iguales");
		}
	}
}
