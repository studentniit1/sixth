package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
	@Entity
	@Component
public class Roles {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int roleid;
	private String rolename;
	@OneToOne
	@JoinColumn(name="uname")
	private UserBean u;
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public UserBean getU() {
		return u;
	}
	public void setU(UserBean u) {
		this.u = u;
	}
	

}
