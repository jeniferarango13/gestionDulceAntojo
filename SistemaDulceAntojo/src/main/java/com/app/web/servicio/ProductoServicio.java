package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Producto;

public interface ProductoServicio {

	public List<Producto> listarTodosLosProductos();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto obtenerProductoPorId(Long id);

	Producto actualizarProducto(Producto producto);

	void eliminarProducto(Long id);
}
