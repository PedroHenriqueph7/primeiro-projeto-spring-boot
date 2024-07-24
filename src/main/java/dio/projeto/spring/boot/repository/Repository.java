package dio.projeto.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.projeto.spring.boot.model.User;



public interface Repository extends JpaRepository<User, Long>{
    User findByNomeUsuario(String nomeUsuario);
    User findByEmail(String email);
    User findByEndereco(String endereco);

    
}
