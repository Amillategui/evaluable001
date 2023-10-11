package com.midominio.evaluable01.model;

public class Asignatura {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int numerosCreditos ;
	private int numerodeAlumnosMatriculados=0;
	
	
	
	
	
	
	public Asignatura(int id, String nombre, String descripcion, int numerosCreditos,
			int numerodeAlumnosMatriculados) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		
		this.numerosCreditos = numerosCreditos;
		this.numerodeAlumnosMatriculados = numerodeAlumnosMatriculados =0;
	
	
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNumerosCreditos() {
		return numerosCreditos;
	}
	public int getNumerodeAlumnosMatriculados() {
		return numerodeAlumnosMatriculados;
	}
	
	
	

}
