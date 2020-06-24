package ipi.perso.sel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Rubrique;

@Repository
public interface RubriqueRepository extends PagingAndSortingRepository<Rubrique, Integer> {
	

}