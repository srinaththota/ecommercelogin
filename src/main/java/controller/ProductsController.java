package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {


	@GetMapping("/allproducts")
	
	public String allProducts() {
		return "hello";
	}
}
