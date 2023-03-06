package com.distribuida.principal;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		UsuarioDAO clienteDAO = context.getBean("clienteDAOImpl", UsuarioDAO.class);
		
		List<Usuario> clientes = clienteDAO.findAll();
	
		for(Usuario cliente : clientes) {
			System.out.println(cliente);
		}
		
	}

}
