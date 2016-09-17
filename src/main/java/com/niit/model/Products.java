
	package com.niit.model;

	import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Table(name="NEW")
@Entity
	@Component
	public class Products {
/*public class Products implements Serializable{
	private static final long serialVersionUID=17L;
	*/
		@OneToMany(mappedBy="product",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//	@JsonIgnore
	//	private List<CartItem> cartItemList;
		
		private MultipartFile file;
		
		private String imgname;
		@Transient
		public MultipartFile getFile() {
			return file;
		}
		public void setFile(MultipartFile file) {
			this.file = file;
		}
		public String getImgname() {
			return imgname;
		}
		public void setImgname(String imgname) {
			this.imgname = imgname;
		}
		private String id;
		
		@NotNull
		private String name;
		@NotNull
		private String variety;
		//@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getVariety() {
			return variety;
		}
		public void setVariety(String variety) {
			this.variety = variety;
		}
		private String description;
		private double price;
	/*	public List<CartItem> getCartItemList() {
			return cartItemList;
		}
		public void setCartItemList(List<CartItem> cartItemList) {
			this.cartItemList = cartItemList;
		}*/
		
	}



