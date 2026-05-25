package com.example;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Manzana {
	
	/* Una clase bien diseñada es aquella que tiene sus propiedades son 
	 * privadas  (modificador de acceso private) y se relaciona con el mundo 
	 * exterior mediante metodos getters and setters publicos */
	
	// Campos o propiedades de la clase (lo que caracteriza al objeto que se va a crear
	// a partir de esta plantilla, es decir, de esta clase)
	
	private String color;
	private String sabor;
	private String variedad;
	private double size; 
	private double peso;
	private BigDecimal precio;
}

		
	// Los contructores (Metodos que tienen el mismo nombre que la clase)
	// y que son los que permiten crear o instanciar los objetos de este tipo de claseConstructor de la clase (es un metodo especial que se llama igual que la clase y no tiene tipo de retorno)

	