package com.application.psm.model;

import java.util.Collection;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name="user", uniqueConstraints= @UniqueConstraint(columnNames = "username"))
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", nullable=false)
	private String name;
	@Column(name = "lastname", nullable=false)
	private String lastname;
	@Column(name = "email", nullable=false)
	private String email;

	private String username;

	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private Role role;

	
	public User() {
	}
	
	public User(String name, String lastname, String email, String username, String password, Role role) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRoles() {
		return role;
	}
	public void setRoles (Role role) {
		this.role = role;
	}
	
	
	
	
}
