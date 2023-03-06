package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.UsuarioDAO;
import com.distruibuida.entities.Usuario;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO clienteDAO;
	
	
	
	@Override
	@Transactional
	public List<UsuarioDAO> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	@Override
	@Transactional
	public Usuario findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	@Override
	public void add(Usuario cliente) {
		// TODO Auto-generated method stub
		clienteDAO.add(cliente);
	}



	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		clienteDAO.del(id);
	}

	@Override
	public List<Usuario> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return clienteDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Usuario cliente = new Usuario(cedula,nombre,apellido,edad,fechaNacimiento,direccion,telefono,correo);
		clienteDAO.add(cliente);
		
	}

	@Override
	@Transactional
	public void up(int idCliente, String cedula, String nombre, String apellido, int edad, Date fecha, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Usuario cliente = new Usuario(idCliente,cedula,nombre,apellido,edad,fecha,direccion,telefono,correo);
		clienteDAO.add(cliente);
		
		
		
	}

	@Override
	public void add(com.distribuida.service.Usuario cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(com.distribuida.service.Usuario cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
