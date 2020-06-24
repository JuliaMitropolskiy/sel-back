package ipi.perso.sel.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
	
	List<Category> findAll();
}