package ipi.perso.sel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Annonce;

@Repository
public interface AnnonceRepository extends PagingAndSortingRepository<Annonce, Long> {
}
