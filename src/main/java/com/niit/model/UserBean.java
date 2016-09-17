package com.niit.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@Table(name="de")
	@Entity
	@Component

	public class UserBean implements Serializable{

		private static final long serialVersionUID = 4657462015039726030L;
		
		private String userId;
		private String email;
		private Integer age;
		private String address;
		private String pwd;
		@Id
		private String uname;
		private boolean enabled=true;
		@OneToOne
		@JoinColumn(name="id")
		private Cart cart;
		
    public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}
	public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Integer getAge() {
			return age;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		
	}

