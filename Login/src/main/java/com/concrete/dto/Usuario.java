package com.concrete.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@ElementCollection(targetClass=Phone.class)
	@Column(name="PHONES")
	private List<Phone> phones;
	
	@Column(name="CREATED")
	private Data created;
	
	@Column(name="MODIFIED")
	private Data modified;
	
	@Column(name="LAST_LOGIN")
	private Data lastLogin;

	public Usuario() {
	}

	public Usuario(int id, String nombre, String email, String password, ArrayList<Phone> phones, Data created,
			Data modified, Data lastLogin) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.phones = phones;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Data getCreated() {
		return created;
	}

	public void setCreated(Data created) {
		this.created = created;
	}

	public Data getModified() {
		return modified;
	}

	public void setModified(Data modified) {
		this.modified = modified;
	}

	public Data getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Data lastLogin) {
		this.lastLogin = lastLogin;
	}

	public List<Phone> getPhones() {
		return null;
	}

	public void setPhones(int number, int cityCode, int countryCode) {
		Phone phone = new Phone();
		phone.setNumber(number);
		phone.setCityCode(cityCode);
		phone.setCountryCode(countryCode);
		phones.add(phone);
	}

}
