package spring.ojt.springojtproject.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import spring.ojt.springojtproject.entities.Products;
import spring.ojt.springojtproject.service.ProductsService;

@RestController("/cont")
public class ProductController {
	
	@Autowired
	private ProductsService productsService;
	
	@RequestMapping("/products")
	public List<Products> allProducts() {
		return productsService.getAllProductList();
	}
	
	@RequestMapping("/products/{id}")
	/*
	 * For requirement 4.. if product id is 1 then return http code status 302
	 * else return http code status 200 along with product description.
	 */
	@ResponseBody
	public ResponseEntity<?> sendViaResponseEntity(@PathVariable("id") String id) {
		if(id.equals("1"))
		{
			return new ResponseEntity<String>("Httpcode 302 for product whose id is 1",
	                HttpStatus.FOUND); 	
		}
		return new ResponseEntity<Products>(productsService.getProduct(id),
                HttpStatus.OK); 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProuct(@RequestBody Products products) {
		productsService.addProduct(products);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProduct(@RequestBody Products products, @PathVariable("id") String id) {
		productsService.updateProduct(products, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void deleteProduct(@PathVariable("id") String id) {
		productsService.deleteProduct(id);
	}
	@RequestMapping("/products/price/{id}")
	ResponseEntity<?> getProduct(@PathVariable String id) {
		   // …
		   CacheControl cacheControl = CacheControl.maxAge(30, TimeUnit.MINUTES);
		   return ResponseEntity.ok()
		           .cacheControl(cacheControl)
		           .body(productsService.getProductPrice(id));
		}
	/*public double productPrice(@PathVariable("id") String id) {
		return productsService.getProductPrice(id);
	}*/

}
