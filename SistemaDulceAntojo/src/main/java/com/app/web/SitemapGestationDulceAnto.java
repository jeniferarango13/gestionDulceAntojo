package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.repositorio.ProductoRepositorio;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SitemapGestationDulceAnto implements CommandLineRunner{

	public SitemapGestationDulceAnto(ProductoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SitemapGestationDulceAnto.class, args);
	}

	@Autowired
	public ProductoRepositorio repositorio;


	@Override
	public void run(String... args) throws Exception {

	}
}
