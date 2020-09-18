package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private float gastoMes;
    
    public Cliente() {}

	public Cliente(int id, String nombre, float gastoMes) {
		this.id = id;
		this.nombre = nombre;
		this.gastoMes = gastoMes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getGastoMes() {
		return gastoMes;
	}

	public void setGastoMes(float gastoMes) {
		this.gastoMes = gastoMes;
	}
    
    


	 	
}
