package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Cart;
import com.niit.model.Products;
import com.niit.service.CartService;
import com.niit.service.ProductService;

@Controller
	public class CartController {
		@Autowired
		private ProductService productservice;
		@Autowired
		private CartService cartService;
		
		private String username;
		 @ModelAttribute
		public void getuserdata(HttpServletRequest req)
		{
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		      String name = auth.getName(); 
		      
		      HttpSession s=req.getSession();
		      s.setAttribute("u", name);
		      username=(String)s.getAttribute("u");
		      System.out.println((String)s.getAttribute("u"));
		}
		 
	
		@RequestMapping("addtocart/{id}")
		public String addtocart(@PathVariable("id")String id)
		{
		//System.out.println("CartController Begin");
			Cart cart=new Cart();
			cart.setProducts(productservice.getProducts(id));
			cart.setQty(1);
			Products price=productservice.getProducts(id);
			cart.setPrice(price.getPrice());
			cartService.add(cart,username);
			//System.out.println("cartController end");
			return "cart";
		}
		//Products getProducts(String getId);
		@RequestMapping("/cart")
		public String getcart(Model map )
		{
			Cart cart=new Cart();
			List<Cart> c=cartService.getAllProducts();
			
			System.out.println("got value from cart");
			map.addAttribute("cart", cart);
			map.addAttribute("cartList", cartService.getAllProducts());
		return "cart";
		}
		
	}



