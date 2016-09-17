package com.niit.controller;

	import java.util.List;
import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com. niit.model.Products;
	import com.niit.service.ProductService;

	@Controller
	public class VarietyController {
		@Autowired(required=true)
		private ProductService productservice;
		
		@RequestMapping(value="/BabyPowders")
		public String P(Map<String, Object> map)
		{
			Products productmodelResult=new Products();
			map.put("products",productmodelResult);
		    map.put("productsList", productservice.getAllBabyPowders());
		  System.out.println(productmodelResult);
			return "Variety";
		}
		@RequestMapping(value="/BabyOil")
		public String BabyOil(Map<String, Object> map)
		{
			Products productmodelResult=new Products();
			map.put("products",productmodelResult);
		    map.put("productsList", productservice.getAllBabyOil());
		  System.out.println(productmodelResult);
			return "Variety";
		}
		@RequestMapping(value="/Shampoos")
		public String Shampoos(Map<String, Object> map)
		{
			Products productmodelResult=new Products();
			map.put("products",productmodelResult);
		    map.put("productsList", productservice.getAllShampoos());
		  System.out.println(productmodelResult);
			return "Variety";
		}
		@RequestMapping(value="/BabySoap")
		public String BabySoap(Map<String, Object> map)
		{
			Products productmodelResult=new Products();
			map.put("products",productmodelResult);
		    map.put("productmodelList", productservice.getAllBabySoap());
		  System.out.println(productmodelResult);
			return "Variety";
		}
		@RequestMapping(value="/BabyLotion")
		public String BabyLotion(Map<String, Object> map)
		{
			Products productmodelResult=new Products();
			map.put("products",productmodelResult);
		    map.put("productsList", productservice.getAllBabyLotion());
		  System.out.println(productmodelResult);
			return "Variety";
		}
	/*	@RequestMapping(value="/product")
		public String view()
		{
			return "cart";
		}*/
		@RequestMapping(value="display")
		public @ResponseBody List<Products> getallProducts()
		{
			List<Products> l=null;
			l=productservice.getAllProducts();
			return l;
		}

}
