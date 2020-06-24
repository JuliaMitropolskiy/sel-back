package ipi.perso.sel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Rubrique;
import ipi.perso.sel.repository.CategoryRepository;
import ipi.perso.sel.repository.RubriqueRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

}
