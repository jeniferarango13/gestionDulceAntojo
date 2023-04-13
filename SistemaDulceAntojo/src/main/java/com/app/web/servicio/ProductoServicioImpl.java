package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Producto;
import com.app.web.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public List<Producto> listarTodosLosProductos() {
		return null;
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return null;
	}

	@Override
	public Producto obtenerProductoPorId(Long id) {
		return null;
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		repositorio.deleteById(id);

	}

}
