package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",nullable = false,length = 50)
	private String nombre;

	@Column(name = "descripcion",nullable = false,length = 50)
	private String descripcion;
	
	@Column(name = "cantidad",nullable = false,length = 50,unique = true)
	private int cantidad;
	@Column(name = "precio",nullable = false,length = 50,unique = true)
	private int precio;
	
	public Producto() {
		
	}

	public Producto(Long id, String nombre, String descripcion, int cantidad, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", descripcion='" + descripcion + '\'' +
				", cantidad=" + cantidad +
				", precio=" + precio +
				'}';
	}
}
