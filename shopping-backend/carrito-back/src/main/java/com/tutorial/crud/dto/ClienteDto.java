package com.tutorial.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ClienteDto {

	    @NotBlank
	    private String nombre;
	   
	    @Min(0)
	    private Float gastoMes;

	    @NotBlank
	    private String tipoUsuario;
	    
	    
	    public ClienteDto() {
	    }

	    public ClienteDto(@NotBlank String nombre, @Min(0) Float gastoMes, @NotBlank String tipoUsuario) {
	        this.nombre = nombre;
	        this.gastoMes = gastoMes;
	        this.tipoUsuario = tipoUsuario;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

		public Float getGastoMes() {
			return gastoMes;
		}

		public void setGastoMes(Float gastoMes) {
			this.gastoMes = gastoMes;
		}

		public String getTipoUsuario() {
			return tipoUsuario;
		}

		public void setTipoUsuario(String tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}

	}
