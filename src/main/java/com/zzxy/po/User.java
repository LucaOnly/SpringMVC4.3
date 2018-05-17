package com.zzxy.po;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {
	private Integer id; // id
	
	@NotEmpty(message = "{user.name.empty}")
	
	@Size(min=1, max=30, message="{user.name.length.error}")
	private String name; // name
	private String pwd; // pwd

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
