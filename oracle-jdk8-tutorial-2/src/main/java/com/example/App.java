package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		// El array es un identificador que hace referencia a una zona de memoria,
		// a diferncia de una variable que hace referencia a una sola ubicacion
		// en la memoria, y que puede contener elementos de un mismo tipo de datos
		// A los elementos del arrays se pueden acceder utilizando un indice numerico,
		// entero, entre corchetes

		/* ¿Como se declara un array actualmente? */
		// por ejemplo, un array de String
		// El identificador nombre es un array donde cada elememto del array
		// es de tipo String

		// ¿Que ventajas nos ofrece?
		// Que en lugar de crerauna variable por cada elemento ahora solo tenemos
		// un nombre para todo el conjunto de los elementos y es mucho mas escalable
		// porque podremos tratar 10, 20, o un millon de elementos de la misma forma

		// Si no existieran los arrays, entonces tendriamos que crear una variable por
		// cada elemento,
		// lo cual no es nada practicoe

		String nombre1;
		String nombre2;

		String nombren; // n significa un numero cualquiera, es decir, n puede ser 10, 20, o un millon ,
		// pero no es una variable, es solo una forma de representar que hay muchos
		// elementos

		String[] nombres = { "Yodalis", "Jakelin", "Yoselin"

		};
		System.out.println("Arrays original de nombres: ");
		System.out.println(nombres[0]); // Yodalis
		System.out.println(nombres[1]); // Jakelin
		System.out.println(nombres[2]); // Yoselin

		System.out.println("El arrays de nombres tiene" + nombres.length + "elementos");
		// Tamaño fijo implica que no se pueden agregar mas elementos al array,
		// pero si se pueden modificar los elementos existentes

		// nombres[3] = "Marisol";

		nombres[2] = "Marisol";

		System.out.println("Array de nombres modificado");

		System.out.println(nombres[2]);

		int[] arrayNumerosEnteros = { 1, 2, 3, 4, 5 };

		// Array de 3 manzanas

		// Manzana [] manzanas = { new Manzana("roja", "dulce", "red delicious", 10,
		// 0.5, new BigDecimal(valueOf(0.5))),
		// new Manzana("verde", "acida", "Granny Smith", 12, 0.6, new
		// BigDecimal(valueOf(0.6))),
		// new Manzana("amarilla", "dulce", "Golden Delicious", 8, 0.4, new
		// BigDecimal(valueOf(0.4)))

		Manzana[] manzanas = {

				Manzana.builder().color("roja").sabor("dulce").variedad("red delicious").size(10).peso(0.5)
						.precio(new BigDecimal(0.5)).build(),

				Manzana.builder().color("verde").sabor("dulce").variedad("Granny Smith").size(6).peso(0.6)
						.precio(new BigDecimal(0.6)).build(),

				Manzana.builder().color("amarilla").sabor("dulce").variedad("Golden Delicious").size(8).peso(0.4)
						.precio(new BigDecimal(0.4)).build(),

				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),

				Manzana.builder().color("Verde").sabor("Acida").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),

				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build(),

				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build() };

		// Hata el momento los arrays que hemos creado son de tamaño fijo, es decir,
		// que no se pueden modificar una vez que se han creado

		/*
		 * Declarar arrays que sean modificables, es decir, que se le puedan agregar o
		 * eliminar elementos o modificar los elementos existentes
		 */

		String[] nombres2 = new String[3];

		// El array de nombres2 tiene 3 elementos, pero todos los elementos son null
		// porque no se le ha asignado un valor aun. Con la sentencia anterior
		// se ha reservado espacio en la memoria para 3 elkementos de tipo String.
		// No sera posible pasarse de la cantidad de elementos reservados para el array
		// que en el caso anterior es de 3.String con tamaño fijo de 3 elementos

		// Agregando elementos al array de nombres2
		nombres2[0] = "Yodalis";
		nombres2[1] = "Jakelin";
		nombres2[2] = "Yoselin";

		/*
		 * SENTENCIA DE CONTROL DE FLUJO. En general permiten modificar el flujo de
		 * ejecucion de un programa en dependencia del cumplimiento de una o varias
		 * condiciones, aqui estarian las sent6encias condicionales if - else y switch -
		 * case y switch - expression
		 * 
		 * Y por otra parte, pero como parte tambien de las sentencias de control flujo
		 * estarian las que permiten ejecutar en bucle un conjunto de sentencias entre
		 * las que estarian
		 * 
		 * 1- sentencia for clasica 2- sentencia for mejorada 3- sentencia while 4-
		 * sentencia do - while
		 * 
		 * Por ultimo las sentencias break y continue
		 */
		/*
		 * La sentencia for clasica, se utiliza cuando se conoce a priori la cantidad de
		 * veces que se van ejecutar un conjunto de instrucciones.
		 * 
		 * Tambien se puede utilizar para recorrer los elementos de un array
		 */

		/*
		 * Para mostrar en la consola los elementos de un array, por ejemplo el array de
		 * nombres
		 */

		/* Si intentamos mostrar por la consola los elementos del array nombres */

		System.out.println("Recorriendo el array" + "nombres con una sentencia for clasica");
		System.out.println("intentando imprimir los elementos del array nombres");
		System.out.println(nombres);

		/*
		 * La sentencia anterior solamente mostro por la consola la direccion de memoria
		 * de la zona donde estan almacenados los elementos del array pero los elementos
		 * como tal no los ha mostrado.
		 * 
		 * Para mostrar los elementos del array se necesita una sentencia de control de
		 * flujo, que en bucle recorra todos los elementos del array de nombres y podria
		 * ser la sentencia for clasica, en primer lugar, y en segundo lugar la
		 * sentencia for mejorada
		 */

		// Primero: Sentencia for clasica

		System.out.println("Recorriendo/Iterando los elementos del array de nombres" + "con una sentencia for clasica");

		int totalNombres = nombres.length;

		for (int i = 0; i <= nombres.length - i; i = i + 1) {
			System.out.println(nombres[i]);

			System.out.println("La sentencia for ha concluido");
		}
		/* OPERADOR DE AUTO INCREMENTO (++) Y DE AUTO DECREMENTO (--) */
		int ii = 0;
		++ii;
		ii++;
		/*
		 * Para comprobar la diferencia entre las dos instrucciones anteriores se puede
		 * utilizar una herramiento de linea de comandos llamado jshell y comprobaremos
		 * que el operador de autoincremento cuando esta solo, es lo mismo que este al
		 * principio que al final, que no es igual a cuando esta en una expresion
		 */

		/*
		 * Ejemplo de creacion de un array de numeros fraccionarios, tipo double, que
		 * tienen parte entera y parte fraccionaria. Los valores del array se tienen que
		 * generar de forma aleatoria y con numeros entre 0 100,
		 * 
		 * Sabemos que debemos de utilizar el metodo random() de la biblioteca Math,
		 * pero no sabemos como hacer que genere numeros aleatorios entre 0 y 100.
		 * 
		 * Por lo tanto vamos a utilizar la herramienta jshell para averiguar como
		 */
		System.out.println("Array de numeros de tipo double, generado de forma aleatoria");
		double[] arrayDeDoubles = new double[20];

		System.out.println("Array original, con los valores por defecto");
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}
		// Rellenando el array con valores generados aleatoriamenre
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = Math.random() * 100 - 1;
		}
		// Mostrando el array resultante
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}
		/*
		 * Ejercicio ·1. Modificarel ejemplo anterior para que array sea de100 numeros
		 * enteros generados aleatoriamente
		 * 
		 * Sugerencia: Hacer un commit previamente a ponerse con la solucion del
		 * ejercicio, para que puedas modificar el codigo sin que se pierda el codigo
		 * del ejemplo original
		 */

		System.out.println(".........Solucion al Ejercicio 1. ........");
		long[] numerosEnteros = new long[100];

		System.out.println("Array original, de numeros enteros:");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		System.out.println("Array resultantes, generado de forma aleatoria");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			numerosEnteros[i] = Math.round(Math.random() * 100 - 1);
		}
		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			System.out.println(numerosEnteros[i]);
		}
		/*
		 * SENTENCIA FOR MEJORADA.
		 * 
		 * Se recomienda su uso siempre que no haya que trabajar con el indice o los
		 * indices de un array
		 */

		System.out.println("----- SENTENCIA FOR MEJORADA (Mal llamada forEach) ---------------");
		for (long numeroEntero : numerosEnteros) {
			System.out.println(numeroEntero);
		}
		/*
		 * Ejercicio ·2. Recorrer el array numerosEnteros y solamente mostrar aquellos
		 * elementos que son de indice par
		 * 
		 * ¿Cuando un valor es par? Cuando el resultado del residuo de la division por 2
		 * es igual a cero. El residuo de la division la da el operador %, o tambien mod
		 * en una calculadora
		 */

		// Solucion utilizando la sentencia for clasica
		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.println("indice: " + i + ",numero: " + numerosEnteros[i]);
			}
		}
		/*
		 * Ejercicio ·3. Recorrer el array numerosEnteros y solamente mostrar aquellos
		 * elementos impares
		 */

		System.out.println("----- Ejercicio 3 -----");

		for (long n : numerosEnteros) {

			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
		/*
		 * Ejercicio 4, recorrer el array de numeros enteros y mostrar solamente los que
		 * sean de indice impar
		 */
		System.out.println("----- Ejercicio 4 -----");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.println("indice:" + i + ", numero " + numerosEnteros[i]);
			}
		}

		/* SENTENCIAS DE ASIGNACION COMPUESTA */

		/*
		 * Primero: En Java existen dos tipos de datos , los tipos de datos primitivos
		 * cuyo nombre es todo letras minusculas, como por ejemplo int, long, byte,
		 * short, boolean, double, float y por otra parte NO TIENEN PROPIEDADES ni
		 * metodos ¿Como lo sabençmos? Porque le aplicamos el operador punto (.) a
		 * continuacion y no se muestra nada
		 */

		int e = 20;
		// e. //no se muestra nada porque el tipo de dato int es un tipo de dato
		// primitivo y no tiene propiedades ni metodos

		/*
		 * Segundo: Existen los tipos de datos no primitivos, que son aquellos cuyo
		 * nombre comienza con mayuscula, como por ejemplo String, BigDecimal, Manzana,
		 * etc. Estos tipos de datos no primitivos SI TIENEN propiedades y metodos
		 */

		Integer e2 = 200;

		/* Existe una excepcion y es que el tipo datos String no tiene primitivo */

		// Tamaño fijo
		String[] nombres3 = { "Elida", "Jakelin", "Juan Carlos", "Miguel" };

		// A continuacion array que no es de tamaño fijo
		String[] nombres4 = new String[100];

		// Ejemplo: Recorrer el array nombres3 y mostrar solamente los nombres que
		// tengan
		// mas de 5 caracteres
		for (String nombre : nombres3) {
			if (nombre.length() > 5) {
				System.out.println(nombre);
			}

		}
		/*
		 * Tercero: Existen las sentencias de asignacion compuestas, que son aquellas
		 * que permiten modificar el valor de una variable utilizando un operador de
		 * asignacion compuesto, como por ejemplo +=, -=, *=, /=, %=, etc.
		 */

		/*
		 * COMENTARIO MUY IMPORTANTE Simpre que sea posible las variables se deben
		 * declarar de un tipo de datos primitivo, porque de esta manera el lenguaje no
		 * tiene que hacer ninguna conversion implicita o explicita.
		 * 
		 * El tipo de datos objeto, la contraparte del primitivo, realmente NO existe,
		 * el tipo objeto es un envoltorio del tipo primitivo
		 */
		byte v1 = 20;
		short v2 = 30;

		// v2 = (short) (v2 + v1);

		// El resultado de la suma es un int, por lo tanto se necesita hacer un casteo
		// explicito a short;

		v2 += v1; // v2 = v2 + v1
		// El operador de asignacion compuesto hace un casteo implicito a short,
		// por lo tanto no es necesario hacer un casteo explicito
		/*
		 * Lo anterior es un ejemplo de la potencia de las sentencias de asignacion
		 * compuesyas De no utiliuzae una sentencia de asignacion compursta en el
		 * ejem`ñp anterior, yemdriamos que terminar haciendo un type casting (casteo en
		 * castellano) que significa obligar a convertir a un tipo de datos concreto,
		 * que debe evitarse en la medida de lo posible.
		 * 
		 * Concretamente en la operacion anterior, los operandos v1 y v2 se convierten
		 * al tipo int y el resultado se obtiene como un int tambien y no se puede
		 * almacenar en la variable v2 a no ser que se realice un casteo a tipo short
		 * 
		 * Todo lo anterior lo realiza la sentencia de asignacion compuesta
		 */
		/*
		 * Conceptos de Contador y Acumulador, implementados a traves del uso de las
		 * sentencias de asignacion compuestas
		 * 
		 * A modo de ejemplo ·1 : vamos a recorrer el array de manzanas y calcularel
		 * peso promediode todas las manzanas
		 * 
		 * A modo de ejemplo# 2: Recorrer el array de manzanas y mostrar solamente las
		 * manzanas cuyo peso sea superior al promedio, de color verde, de tamaño (size)
		 * superior a 5, y de sabor dulce
		 */

		/* Solucion al ejemplo · 1 */
		// Contador para llevar la cuenta de la cantidad de manzanas a las cuales se les
		// ha sumado el peso, para luego poder hacer el calculo del promedio

		int counter = 0;
		// Acumulador para ir sumando el peso de cada manzana, para luego poder hacer el
		// calculo del promedio
		double acumuladorPeso = 0.0; // Sumatoria del peso de las manzanas

		// ¿sentencia for clasica o mejorada? Rta Mejorada, porque no se pide nada
		// respecto al indice del array de manzanas
		for (Manzana m : manzanas) {

			// Incrementando el contador en 1 por cada manzana que se recorre
			++counter; // counter = counter + 1; //counter += 1;
			acumuladorPeso += m.getPeso(); // acumuladorPeso = acumuladorPeso + manzana.getPeso();

		}
		// Fuera del bucle, se calcula el peso promedio dividiendo la sumatoria
		// del peso de las manzanas entre la cantidad de manzanas
		double pesoPromedio = acumuladorPeso / counter;

		// Imprimir en la consola el peso promedio de las manzanas
		System.out.println("El peso promedio de las manzanas es: " + pesoPromedio);

		/*
		 * Solucion al ejemplo · 2. Utilizacion del operador logico relacional && que en
		 * otros lenguajes de programacion seria el operador AND e implica que tienen
		 * que ser verdaderas las condiciones a la izquierda y a la derecha del operador
		 * para que la condicion completa, al evaluar la expresion sea verdadera.
		 * 
		 * Se le llama tambien al operador && de corto-circuito, porque la primetra
		 * condicion que encuentre que es falsa ya no continua evaluando la restante
		 */
		for (Manzana man : manzanas) {
			if (man.getPeso() > pesoPromedio && man.getColor().toLowerCase().equals("verde") && man.getSize() > 5
					&& man.getSabor().toLowerCase().equals("dulce")) {
				System.out.println(man.toString());

			}

		}
		/* Demostracion de que el operador logico && es de corto-circuito */

		BigDecimal precio = new BigDecimal(0.80);
		System.out.println("Precio original: " + precio);

		for (Manzana man1 : manzanas) {

			if (man1.getPeso() > pesoPromedio && man1.getColor().toLowerCase().equals("verde") && man1.getSize() > 7
					&& man1.getPrecio().equals(precio = new BigDecimal(2.00))
					&& man1.getSabor().toLowerCase().equals("dulce")) {
				System.out.println(man1.toString());
			}
			System.out.println("Precio modificado ????" + precio);
			/*
			 * En el ejemplo anterior, el precio no se ha modificado porque la primera
			 * condicion que se ha evaluado es falsa, por lo tanto el operador logico && no
			 * ha continuado evaluando las restantes condiciones, y por lo tanto el precio
			 * no se ha modificado
			 */
		}
	}
}
