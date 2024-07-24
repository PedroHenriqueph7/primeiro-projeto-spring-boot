package dio.projeto.spring.boot.model;


public class aplication {

    public static void main(String[] args) {

        User novoUser = new User();
        User novoUser2 = new User();

        novoUser.setId(111);
        novoUser.setNomeUsuario("nome teste");
        novoUser.setEmail("teste123@email.com");
        novoUser.setSenha("senhasegura");
        novoUser.setEndereco("Cidade Y, Rua Z, Estado XXX");

        novoUser2.setId(222);
        novoUser2.setNomeUsuario("nome teste2");
        novoUser2.setEmail("testeuser2@email.com");
        novoUser2.setSenha("senha22");
        novoUser2.setEndereco("Cidade X, Rua Y, Estado ZZZ");
    }
   
}
