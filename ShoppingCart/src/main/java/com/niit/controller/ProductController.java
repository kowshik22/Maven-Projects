package com.niit.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.SupplierDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.util.Util;

@Controller
public class ProductController {

	@Autowired(required=true)
	private ProductDao productDao;
	@Autowired(required=true)
	private CategoryDao categoryDao;
	@Autowired(required=true)
	private SupplierDao supplierDao;
	private Path path;
	
@RequestMapping(value="/products",method=RequestMethod.GET)
public String listProducts(Model model) {
System.out.println("Hello.. I'm inside /products list");
model.addAttribute("product",new Product());
model.addAttribute("productList", this.productDao.list());

model.addAttribute("Category", new Category());
model.addAttribute("Supplier", new Supplier());

model.addAttribute("supplierList", this.supplierDao.list());
model.addAttribute("categoryList", this.categoryDao.list());

return "product";
}
@RequestMapping(value = "/product/add", method = RequestMethod.POST)
public String addProduct(@ModelAttribute("product") Product product, Model model) {
System.out.println(product.getCategory().getName());
System.out.println(categoryDao.getByName(product.getCategory().getName()));
	Category category = categoryDao.getByName(product.getCategory().getName());
	System.out.println(category.getId() + ":" + category.getName() + ":" + category.getDescription());

	Supplier supplier = supplierDao.getByName(product.getSupplier().getName());
	System.out.println(supplier.getId() + ":" + supplier.getName() + ":" + supplier.getAddress());

	model.addAttribute("Supplier", supplier);
	model.addAttribute("Category", category);
	model.addAttribute("supplierList", this.supplierDao.list());
	model.addAttribute("categoryList", this.categoryDao.list());

	String newID = Util.removeComma(product.getId());
	product.setId(newID);

	product.setCategory_id(category.getId());
	product.setSupplier_id(supplier.getId());
	
	product.setCategory(category);
	product.setSupplier(supplier);

	productDao.saveOrUpdate(product);

	/*path="D:\\product\\image";		
	FileUtil.upload(path, itemImage, product.getId()+".png");*/
	
	
	
	MultipartFile itemImage = product.getItemImage();
	path = Paths.get("G:\\workspace\\get\\src\\main\\webapp\\resources\\images\\" + product.getId() + ".jpg");
	
	
	

	if (itemImage != null && !itemImage.isEmpty()) {
		try {
			System.out.println("inside try");
			itemImage.transferTo(new File(path.toString()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("product image saving failed.", e);
		}
	}

	return "redirect:/products";

}

@RequestMapping("/product/remove/{id}")
public String removeProduct(@PathVariable("id") String id, ModelMap model) throws Exception {
	System.out.println("Hello.. I'm inside /products remove");
	try {
		productDao.delete(id);
		model.addAttribute("message", "Successfully deleted");
	} catch (Exception e) {
		model.addAttribute("message", e.getMessage());
		e.printStackTrace();
	}
	
	
	path = Paths.get("G:\\workspace\\get\\src\\main\\webapp\\resources\\images\\" + id + ".jpg");
	
	if (Files.exists(path)) {
        try {
            Files.delete(path);
            System.out.println("Image successfully deleted");
        } catch (IOException e) {
        	  System.out.println("Error in Image deletion");
            e.printStackTrace();
        }
    }
	// redirectAttrs.addFlashAttribute(arg0, arg1)
	return "redirect:/products";
}

@RequestMapping("/product/edit/{id}")
public String editProduct(@PathVariable("id") String id, Model model) {
	//model.addAttribute("isAdminClickedEditProducts", "true");
	System.out.println("Hello.. I'm inside /products edit");
	model.addAttribute("Category", new Category());
	model.addAttribute("Supplier", new Supplier());
	model.addAttribute("supplierList", this.supplierDao.list());
	model.addAttribute("categoryList", this.categoryDao.list());
	model.addAttribute("product", this.productDao.get(id));
	model.addAttribute("productList", this.productDao.list());
	return "product";
}




@RequestMapping("product/get/{id}")
public String getSelectedProduct(@PathVariable("id") String id, Model model,RedirectAttributes redirectAttributes) {
	System.out.println("getSelectedProduct");
	
	model.addAttribute("productList", this.productDao.list());
	
	// redirectAttributes.addFlashAttribute("selectedProduct", this.productDAO.get(id));
	model.addAttribute("selectedProduct", this.productDao.get(id));
	 //model.addAttribute("categoryList", this.categoryDAO.list());
	 return "product";
}


}

