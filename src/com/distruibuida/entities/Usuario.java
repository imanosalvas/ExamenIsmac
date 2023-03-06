package com.distruibuida.entities;

import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Component
@Entity
@Table(name="Usuarios")
public class Usuario{
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int idUsuario;
	@Column(name="cedula")
	private String cedula;
	@Column(name="nombre1")
	private String nombre1;
	@Column(name="nombre2")
	private String nombre2;
	@Column(name="apellido1")
	private String apellido1;
	@Column(name="apellido2")
	private String apellido2;
	@Column(name="fecha_nacimiento")
	private Date fechanacimiento;
	@Column(name="edad")
	private int edad;
	@Column(name="sexo")
	private String sexo;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="tipo")
	private String tipo;

//@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)

	
	
	
public Usuario() {}
		
		
public Usuario(String cedula, String nombre1,String nombre2, String apellido1,String apellido2,  Date fechanacimiento,int edad, String sexo,String direccion,String telefono,String correo, String tipo) {
	this.cedula = cedula;
	this.nombre1 = nombre1;
	this.nombre2 = nombre2;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.fechanacimiento = fechanacimiento;
	this.edad = edad;
	this.direccion = direccion;
	this.telefono= telefono;
	this.correo = correo;
	this.tipo = tipo;
}

public Usuario(int id, String cedula, String nombre1,String nombre2, String apellido1,String apellido2,  Date fechanacimiento,int edad, String sexo,String direccion,String telefono,String correo, String tipo) {
	this.idUsuario = id;
	this.cedula = cedula;
	this.nombre1 = nombre1;
	this.nombre2 = nombre2;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.fechanacimiento = fechanacimiento;
	this.edad = edad;
	this.direccion = direccion;
	this.telefono= telefono;
	this.correo = correo;
	this.tipo = tipo;
}


public int getIdCliente() {
	return idUsuario;
}


public void setIdCliente(int idCliente) {
	this.idUsuario = idCliente;
}


public String getCedula() {
	return cedula;
}


public void setCedula(String cedula) {
	this.cedula = cedula;
}


public String getNombre1() {
	return nombre1;
}


public void setNombre1(String nombre1) {
	this.nombre1 = nombre1;
}


public String getNombre2() {
	return nombre2;
}


public void setNombre2(String nombre2) {
	this.nombre2 = nombre2;
}


public String getApellido1() {
	return apellido1;
}


public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}


public String getApellido2() {
	return apellido2;
}


public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}


public Date getFechanacimiento() {
	return fechanacimiento;
}


public void setFechanacimiento(Date fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getSexo() {
	return sexo;
}


public void setSexo(String sexo) {
	this.sexo = sexo;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


@Override
public String toString() {
	return "\n Usuario=" + idUsuario + "\n cedula=" + cedula + "\n nombre1=" + nombre1 + "\n nombre2=" + nombre2
			+ "\n apellido1=" + apellido1 + "\n apellido2=" + apellido2 + "\n fechanacimiento=" + fechanacimiento
			+ "\n edad=" + edad + "\n sexo=" + sexo + "\n direccion=" + direccion + "\n telefono=" + telefono + "\n correo="
			+ correo + "\n tipo=" + tipo ;
}












}
