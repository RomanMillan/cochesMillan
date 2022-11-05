package com.jacaranda;

import java.time.LocalDate;

public class User {

	private int id;
	private String user;
	private String password;
	private String name;
	private String surname;
	private boolean gender;
	private LocalDate birthday; 
	private boolean administrador;
	
	//constructores
	public User() {
		super();
		user = null;
		password = null;
		name = null;
		surname = null;
		gender  = false;
		birthday = null;
		administrador  =false;
	}
	
	public User(String user, String password, String name, String surname, boolean gender, LocalDate birthday,
			boolean administrador) {
		super();
		this.user = user;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthday = birthday;
		this.administrador = administrador;
	}



	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
