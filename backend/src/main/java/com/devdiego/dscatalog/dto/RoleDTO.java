package com.devdiego.dscatalog.dto;

import java.io.Serializable;

import com.devdiego.dscatalog.entities.Role;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long ID;
	private String authority;
	
	public RoleDTO() {
	}

	public RoleDTO(Long iD, String authority) {
		super();
		ID = iD;
		this.authority = authority;
	}
	
	public RoleDTO(Role role) {
		super();
		ID = role.getIg();
		this.authority = role.getAuthority();
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
