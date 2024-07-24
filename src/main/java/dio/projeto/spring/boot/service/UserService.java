package dio.projeto.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;

import dio.projeto.spring.boot.model.User;
import dio.projeto.spring.boot.repository.Repository;

   
public class UserService {
    @Autowired
    private Repository repository;

    public void registrarUsuario(User usuario) {
       repository.save(usuario);
    }
    
    public void removerUsuario(User usuario) {
        repository.delete(usuario);
     }
    

}
