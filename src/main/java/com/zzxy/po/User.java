package com.zzxy.po;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id; // id
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
