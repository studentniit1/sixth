package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.model.Products;
import com.niit.service.ProductService;

@Controller
public class AcessController {
	@ModelAttribute("ob")
	public Products construct(){
		return new Products();
	}
	@Autowired(required=true)
	private ProductService productservice;
	///*
	@RequestMapping("/product")
	public String setupForm(Map<String, Object> map){
		Products products = new Products();
		map.put("product", products);
		map.put("productList", productservice.getAllProducts());
		return "product";
	}
	
	
	@RequestMapping("delete/{id}")
	public String delitem(@PathVariable("productid")String id,ModelMap model)
	{
		productservice.delete(id);
		return"redirect:/viewall2";
	}
	
	@RequestMapping("edit/{id}")
	public String edititem(@PathVariable("id")String id,@ModelAttribute Products products, BindingResult result,Map<String, Object> map)
	{	
		products=productservice.getProducts(id);
		map.put("product", products);
		map.put("productList", productservice.getAllProducts());
		return "product";
		
	}
	
	
	@RequestMapping("desc/{id}")
	public String proddesc(@PathVariable("id")String id,@ModelAttribute Products products, BindingResult result,Map<String, Object> map)
	{	
		products=productservice.getProducts(id);
		System.out.println(products);
		map.put("product", products);
		map.put("productList", productservice.getAllProducts());
		return "proddesc";
		
	}
	
	@RequestMapping({"/viewall2","edit/viewall2"})
	public String getvieform(Map<String,Object>map)
	{
		Products products=new Products();
		map.put("product",products);
		map.put("productList", productservice.getAllProducts());
		return"viewall2";
	}
	//*/
//	@RequestMapping(value="/product")
	//public String prod()
	//{
//	return "product";	
//	}
	
	@RequestMapping(value="/productmodel", method=RequestMethod.POST)
	public String doActions(@ModelAttribute("ob") Products products, BindingResult result, @RequestParam String action, Map<String, Object>map){
	    Products productmodelResult = new Products();
	    switch(action.toLowerCase()){
	    case "add":
	    	productservice.add(products);
	    	MultipartFile file=products.getFile();
	    	if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath = "C:/Users/Toshiba/workspace/ProducerGets/src/main/webapp/resources/img/first";
					File dir = new File(rootPath + File.separator + "upload");
					if (!dir.exists()){
						System.out.println("in dir creation");
						dir.mkdirs();
					}
						

					// Create the file on server
					File serverFile = new File(dir.getAbsolutePath()
							+ File.separator +".jpg");
					BufferedOutputStream stream = new BufferedOutputStream(
							new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();
					return "redirect:/product";
					
				//	return "product";
					
				} catch (Exception e) {
					e.printStackTrace();
				//	return "redirect:/error";
					
				}
				
	    	}
	    	productmodelResult = products;
	    	break;
	    	
	    case "edit":
	    	productservice.edit(products);
	    	productmodelResult = products;
	    	break;
	    	
	    case "delete":
	    	productservice.delete(products.getId());
	    	productmodelResult = new Products();
	    	break;
	    	
	    case "search":
	    	Products searchedProducts = productservice.getProducts(products.getId());
	    	productmodelResult = searchedProducts!=null ? searchedProducts : new Products();
	    	break;
	    }
	    map.put("productModel",productmodelResult);
	    map.put("productsList", productservice.getAllProducts());
	    
		return "product";
	}

}
