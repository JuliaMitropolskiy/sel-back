package ipi.perso.sel.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Category;
import ipi.perso.sel.model.Rubrique;

@Repository
public interface RubriqueRepository extends PagingAndSortingRepository<Rubrique, Integer> {
	
	List<Rubrique> findAll();
	
	List<Rubrique> findByCategory(Category category);
	
}