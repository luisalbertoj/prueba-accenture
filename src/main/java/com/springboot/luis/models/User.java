package com.springboot.luis.models;

import java.io.Serializable;

public class User implements Serializable {
 
    private static final long serialVersionUID = 1L;
   
    private Integer cedula;
    
    private String direccion;
 
    private String name;
 
    private String username;
 
    public User() {
        super();
    }
     
   
 
    public User(Integer cedula, String direccion, String name, String username) {
		super();
		this.cedula = cedula;
		this.direccion = direccion;
		this.name = name;
		this.username = username;
	}



	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
 
}