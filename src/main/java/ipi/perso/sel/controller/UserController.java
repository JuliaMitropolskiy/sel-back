package ipi.perso.sel.controller;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ipi.perso.sel.model.User;
import ipi.perso.sel.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/inscription")
    public void createAccount (@RequestBody User user) throws Exception {
    	try {
    		userService.findUserByMail(user.getMail());
    		throw new EntityExistsException("Le compte '" + user.getMail() + "' existe déjà.");
    	} catch (EntityNotFoundException e) {
    		userService.inscription(user);
    	}
    	
//        if (userService.findUserByMail(user.getMail()) != null) {
//            throw new Exception("Utilisateur avec cet adresse mail existe déjà.");
//        }
//        userService.inscription(user);
    }

    @GetMapping("/connexion")
    @ResponseBody
    public User connexion (@RequestHeader("login") String mail, @RequestHeader("password") String password) throws Exception {
        User user = userService.findUserByMail(mail);
        if (!password.equals(user.getPassword())) {
            throw new Exception("Le mot de passe est incorrect.");
        }
        return user;
    }
    
    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
    	return userService.findUserById(id);
    }

}
