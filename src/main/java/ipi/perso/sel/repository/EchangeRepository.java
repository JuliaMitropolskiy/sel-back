package ipi.perso.sel.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Echange;

@Repository
public interface EchangeRepository extends PagingAndSortingRepository<Echange, Long> {
	List<Echange> findAll();
	
}
