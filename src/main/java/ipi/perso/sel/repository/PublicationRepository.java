package ipi.perso.sel.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.Publication;

@Repository
public interface PublicationRepository extends PagingAndSortingRepository<Publication, Long> {
	
	Optional<Publication> findById(Long id);

}
