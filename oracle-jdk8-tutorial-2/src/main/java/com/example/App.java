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

		// Si quisiera crear un objeto manzana y solamente especificar el color de la
		// Manzana,
		// me daria error porque yo no tengo un constructor que reciba un solo parametro

		Manzana manzana2 = new Manzana("Golden");
		System.out.println("------- Imprimiendo manzana2 ------- ");
		System.out.println(manzana2);

		/*
		 * ¿ Como comparar dos objetos Manzana para saber si son iguales o no?
		 * 
		 * Vamos a crear dos objetos Manzanas que sean de la misma vcariedad y precio
		 */
		Manzana manzana3 = new Manzana("reineta", new BigDecimal(2.0));
		Manzana manzana4 = new Manzana("reineta", new BigDecimal(2.0));

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

		if (x == y) {
			System.out.println("Las variables x e y son iguales");
		} else {
			System.out.println("Las variables x e y no son iguales");
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
