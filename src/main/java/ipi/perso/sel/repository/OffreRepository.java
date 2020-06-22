package ipi.perso.sel.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Offre;

@Repository
public interface OffreRepository extends PagingAndSortingRepository<Offre, Long> {
	List<Offre> findAll();
}
