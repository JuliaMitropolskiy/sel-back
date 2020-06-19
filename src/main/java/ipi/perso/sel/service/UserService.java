package ipi.perso.sel.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipi.perso.sel.model.User;
import ipi.perso.sel.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void inscription(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void modifierProfil(User user) {
//        User userAModifier = userRepository.findById(user.getId()).get();
//        userAModifier.setNom(user.getNom());
//        userAModifier.setPrenom(user.getPrenom());
//        userAModifier.setAdresse(user.getAdresse());
//        userAModifier.setCommune(user.getCommune());
//        userAModifier.setNumTel(user.getNumTel());
//        userAModifier.setMail(user.getMail());
//        userAModifier.setPhotoLien(user.getPhotoLien());
//        userRepository.save(userAModifier);
    	
    	if (!userRepository.findById(user.getId()).isPresent()) {
    		throw new EntityNotFoundException("L'utilisateur avec id " + user.getId() + " n'existe pas.");
    	}
    	userRepository.save(user);
    }

    public User findUserByMail(String mail) {
    	User user = userRepository.findByMail(mail);
    	if (null == user) {
    		throw new EntityNotFoundException("Compte '" + mail + "' introuvable.");
    	}
        return user;
    }
    
    public User findUserById(Long id) {
    	Optional<User> user = userRepository.findById(id);
    	if (!user.isPresent()) {
    		throw new EntityNotFoundException("L'utilisateur avec id '" + id + "' n'existe pas.");
    	}
    	return user.get();
    }
}
