
	package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

    @Table(name="loade")
	@Entity
	@Component
	public class User {
		@Id
		private int uid;
		private String uname;
		private boolean enabled;
		private String pwd;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		
		public boolean getEnabled() {
			return enabled;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
    }
		