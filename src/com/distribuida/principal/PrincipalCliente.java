package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.service.UsuarioService;

public class PrincipalCliente {
	public static void main (String[] args) {
		


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	UsuarioService ClienteService = context.getBean("clienteServiceImpl",UsuarioService.class);
	
	//LISTAR TODOS LOS REGISTROS
	List<Usuario> Clientes = ClienteService.findAll();

	//LISTAR UN REGISTRO
	Usuario cliente = ClienteService.findOne(1);
	
	
	///AGREGAR
//ClienteService.add("999999999","CAMILO9","PAEZ9",99,new Date(),"MARIN9","999999999","@GAMIL9");
	
	//ACTUALIZAR
	//ClienteService.up(60,"","","",25,new Date(), "99","99","99");

	///BORRAR
//  ClienteService.del(80);	
	
//	ClienteService.findAll("50");
	
	//LISTAR TODOS LOS REGISTROS CON CARACTERES ESPECIFICOS		
	//List<Cliente> Clientes1 = ClienteService.findAll("na");
	
	for(Usuario item : Clientes) {
		System.out.println(item);
	
	}
	//System.out.println(Clientes1);
	
	
}
}