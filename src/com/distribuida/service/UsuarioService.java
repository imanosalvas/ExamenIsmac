package com.distribuida.service;

import java.util.Date;
import java.util.List;


import com.distruibuida.entities.Usuario;

public interface UsuarioService {
	
	
	public List<Usuario> findAll();
	
	public Usuario findOne(int id);
	
	public void add(Usuario usuario);
	
	//public void up(Usuario usuario);
	
	public void del(int id);
	
	
	public List<Usuario> findAll(String busqueda);
	public void add(String cedula, String nombre, String apellido , int edad, Date fecha, String direccion, String telefono, String correo);
	public void up(int idCliente,String cedula, String nombre, String apellido, int edad, Date fecha, String direccion, String telefono, String correo);

	
}
