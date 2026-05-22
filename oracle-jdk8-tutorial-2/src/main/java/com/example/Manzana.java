package com.example;

import java.math.BigDecimal;
import java.util.Objects;

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
		
	// Los contructores (Metodos que tienen el mismo nombre que la clase)
	// y que son los que permiten crear o instanciar los objetos de este tipo de claseConstructor de la clase (es un metodo especial que se llama igual que la clase y no tiene tipo de retorno)

	public Manzana(String variedad) {
		super();
		this.variedad = variedad;
	}

	public Manzana() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manzana(String color, String sabor, String variedad, double size, double peso, BigDecimal precio) {
		super();
		this.color = color;
		this.sabor = sabor;
		this.variedad = variedad;
		this.size = size;
		this.peso = peso;
		this.precio = precio;
	}

	// Metodos getters and setters (son los que permiten acceder a las propiedades privadas de la clase)(metodos publicos para manejar las propiedades privadas)


	public String getColor() {
		return color;
	}
	public Manzana(String variedad, BigDecimal precio) {
		super();
		this.variedad = variedad;
		this.precio = precio;
	}

	public String getPeso() {
		return String.valueOf(peso);
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Manzana [color=" + color + ", sabor=" + sabor + ", variedad=" + variedad + ", size=" + size + ", peso="
				+ peso + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(precio, variedad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manzana other = (Manzana) obj;
		return Objects.equals(precio, other.precio) && Objects.equals(variedad, other.variedad);
	}

	
	// Otros metodos (No estan asociados a ninguna propiedad concreta, sino que son acciones o comportamientos sino a varias)
	
	
	
	
}
	
