package com.niit.model;
   import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.validation.constraints.NotNull;

	import org.springframework.stereotype.Component;


		@Entity(name="Users")
		@Component
		public class Register {
			@NotNull
			private String username;
			@NotNull
			private String password;
			
			@Id
			@NotNull
			private String email;
			@NotNull
			private String mobile;
			
			
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
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getMobile() {
				return mobile;
			}
			public void setMobile(String mobile) {
				this.mobile = mobile;
			}
			
	}


