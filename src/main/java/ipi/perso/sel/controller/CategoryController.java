package ipi.perso.sel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.service.CategoryService;
import ipi.perso.sel.service.RubriqueService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("")
	@ResponseBody
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}

}
