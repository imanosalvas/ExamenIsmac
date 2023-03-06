package com.distribuida.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distruibuida.entities.Usuario;




@Repository
public  class UsuarioDAOImpl implements UsuarioDAO{


	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		List<Usuario> usuarios = session.createQuery("select us from Usuario us",Usuario.class).getResultList();
		return usuarios;
	}

	@Override
	@Transactional
	public Usuario findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery("select us from Usuario us where idUsuario = : keyID",Usuario.class);
		return session.get(Usuario.class, id);
	}

	@Override
	@Transactional
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.save(usuario);	
	}

	@Override
	public void up(Usuario usuario) {
		// TODO Auto-generated method stub
	
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		
		Usuario usuario = session.get(Usuario.class,id);
		
		session.delete(usuario);
	}

	@Override
	@Transactional
	public List<Usuario> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query  query = session.createQuery(
			"Select CL"
				+" from Cliente CL"
				+" where CL.cedula LIKE : keybusqueda "
				+" or CL.nombre LIKE :keybusqueda "
				+" or CL.apellido LIKE : keybusqueda "
				+" or CL.edad LIKE : keybusqueda "
				+" or CL.fechaNacimiento LIKE : keybusqueda "
				+" or CL.direccion LIKE : keybusqueda "
				+" or CL.telefono LIKE : keybusqueda "
				+" or CL.correo LIKE : keybusqueda "

				, Usuario.class);
				
	query.setParameter("keybusqueda","%" +busqueda+"%");	
		return query.getResultList();
	}

	

	

	
	
}
