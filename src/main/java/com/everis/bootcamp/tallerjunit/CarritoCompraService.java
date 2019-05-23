package com.everis.bootcamp.tallerjunit;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompraService {
	
	List<Articulo> articulos = new ArrayList<Articulo>();
	
	public void limpiarCesta(){
		System.out.println("Prueba");
		System.out.println("Prueba");
		System.out.println("Prueba");
		articulos = new ArrayList<Articulo>();
	}
	
	public void addArticulo(Articulo a){
		articulos.add(a);
	}
	
	public int getNumArticulo(){
		return articulos.size();
	}
	
	public Double totalPrice(){
		double precioTotal = articulos.stream().  	
			     mapToDouble(Articulo::getPrecio).
			     sum();
		return precioTotal;
	}
	
	public static Double calculadorDescuento(double precio, double porcentajeDescuento){
		return precio - (precio * (porcentajeDescuento/100));
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	

}
