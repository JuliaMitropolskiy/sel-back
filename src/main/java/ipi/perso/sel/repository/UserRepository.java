package ipi.perso.sel.repository;


import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ipi.perso.sel.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	Optional<User> findById(Long id);

    User findByMail(String mail);
}
